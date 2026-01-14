/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinical_documentation_service.clinical_service.VO;

import java.time.LocalDate;
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
public class Patient {
    private Long id;

    private String nationalId; 

    private String fullName;
    private String phoneNumber;
    private String gender;
    private LocalDate dateOfBirth;
    
   
    private String allergies; 
}
