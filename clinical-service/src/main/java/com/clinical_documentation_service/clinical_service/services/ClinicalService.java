/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinical_documentation_service.clinical_service.services;

import com.clinical_documentation_service.clinical_service.Repositories.ClinicalRepository;
import com.clinical_documentation_service.clinical_service.VO.Patient;
import com.clinical_documentation_service.clinical_service.VO.ResponseTemplateVO;
import com.clinical_documentation_service.clinical_service.models.Clinical;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Nour
 */
@Service
public class ClinicalService {
    @Autowired
    private ClinicalRepository clinicalRepository;
    @Autowired
    private  RestTemplate restTemplate;
// لجلب كل السجلات الطبية السريرية
    public List<Clinical> getAllClinical() {
        return this.clinicalRepository.findAll();
    }
 public Clinical getClinicalById(Long id) {
        return this.clinicalRepository.findById(id).get();
    }
 public Clinical getClinicalNationalId(String nationalId) {
return this.getAllClinical().stream()
                .filter(c -> c.getNationalId().equals(nationalId))
                .findFirst()
                .orElse(null);   
 }
    
    // لإضافة سجل طبي جديد (الحفظ في الداتابيز)
    public Clinical addClinical(Clinical record) {
        return this.clinicalRepository.save(record);
    }

    public ResponseTemplateVO getClinicalWithItemByNationalId(String nationalId) {

        Clinical clinical=this.getClinicalNationalId(nationalId);
        
        Patient patient=this.restTemplate.getForObject("http://APPSERVICE/patients/nationalid/"+clinical.getNationalId(), Patient.class);
        
        ResponseTemplateVO vo = new ResponseTemplateVO();
        vo.setClinical(clinical);
        vo.setPatient(patient);
        
        return vo;
    
    }
}
