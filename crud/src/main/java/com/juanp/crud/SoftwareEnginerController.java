package com.juanp.crud;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEnginerController {

    final SoftwareEngineerService softwareEngineerService;

    public SoftwareEnginerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineerEntity> getEngineers() {
        return softwareEngineerService.getAllSoftwareEngineer();
    }

    @PostMapping
    public void addNewSoftwareEngineer( @RequestBody SoftwareEngineerEntity softwareEngineerEntity ) {
         softwareEngineerService.insertSoftwareEngineer( softwareEngineerEntity );
    }

    @GetMapping("{id}")
    public SoftwareEngineerEntity getSoftwareEngineerBiId( @PathVariable Integer id ) {
      return  softwareEngineerService.getSoftwareEngineerById(id);
    }

}
