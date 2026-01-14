/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinical_documentation_service.clinical_service.VO;

import com.clinical_documentation_service.clinical_service.models.Clinical;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Nour
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Clinical clinical;
    private Patient patient;
    
}
