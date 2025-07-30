
package com.juanp.crud;

import org.springframework.data.jpa.repository.JpaRepository;

interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineerEntity, Integer> {
    // This interface will automatically provide CRUD operations for SoftwareEngineer entities

    
}