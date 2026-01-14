/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinical_documentation_service.clinical_service.controllers;

import com.clinical_documentation_service.clinical_service.VO.ResponseTemplateVO;
import com.clinical_documentation_service.clinical_service.models.Clinical;
import com.clinical_documentation_service.clinical_service.services.ClinicalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nour
 */
@RestController
@RequestMapping("/clinical/")
public class ClinicalController {
    @Autowired
    private ClinicalService clinicalService;
    
    @GetMapping("/")
    public ResponseEntity<List<Clinical>>getAllClinical(){
    List<Clinical> clinicals=this.clinicalService.getAllClinical();
    return  new ResponseEntity<>(clinicals,HttpStatus.OK);
    }
    
//    @GetMapping("/{id}")
//    public ResponseEntity<Clinical>getClinicalById(@PathVariable Long id){
//    Clinical clinicals=this.clinicalService.getClinicalById(id);
//    return  new ResponseEntity<>(clinicals,HttpStatus.OK);
//    }
    
     @PostMapping("/{add}")
    public ResponseEntity<Clinical>addClinical(@RequestBody Clinical clinical){
    Clinical clinicals=this.clinicalService.addClinical(clinical);
    return  new ResponseEntity<>(clinicals,HttpStatus.CREATED);
    }
    
    @GetMapping("/nationalid/{nationalId}")
    public ResponseEntity<ResponseTemplateVO>getClinicalWithItemByClinicalId(@PathVariable("nationalId")String nationalId){
    
       ResponseTemplateVO vo= this.clinicalService.getClinicalWithItemByNationalId(nationalId);
       
       return  new ResponseEntity<>(vo,HttpStatus.OK);
    }
    
}
