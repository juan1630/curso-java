package com.juanp.crud;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineerEntity> getAllSoftwareEngineer() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineerEntity softwareEngineerEntity) {
        softwareEngineerRepository.save(softwareEngineerEntity);
    }

    public SoftwareEngineerEntity getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                id + "not Found"));
    }
}
