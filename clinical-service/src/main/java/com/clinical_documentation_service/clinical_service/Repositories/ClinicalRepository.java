/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clinical_documentation_service.clinical_service.Repositories;

import com.clinical_documentation_service.clinical_service.models.Clinical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nour
 */
@Repository
public interface ClinicalRepository extends JpaRepository<Clinical, Long>{
    
}
