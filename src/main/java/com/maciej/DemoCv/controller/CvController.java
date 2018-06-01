package com.maciej.DemoCv.controller;

import com.maciej.DemoCv.entity.CustomEntity;
import com.maciej.DemoCv.entity.Cv;
import com.maciej.DemoCv.entity.User;
import com.maciej.DemoCv.service.CvService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class CvController {

    private final EntityManager entityManager;

    private final CvService cvService;

    public CvController(EntityManager entityManager, CvService cvService) {
        this.entityManager = entityManager;
        this.cvService = cvService;
    }

    @RequestMapping("/index")
    public List<User> getCv() {
        return cvService.importAll();
    }

    @RequestMapping("/object")
    public List<CustomEntity> getObject() {
        List<Object[]> results = this.entityManager.createQuery("SELECT t1.email, t1.firstName, t1.lastName, t2.cvAccepted FROM User t1 JOIN Employee t2 ON t1.employee = t2.id").getResultList();
        return results.stream().map((record -> {
            CustomEntity customEntity = new CustomEntity();
            customEntity.setEmail((String) record[0]);
            customEntity.setFirstName((String) record[1]);
            customEntity.setLastName((String) record[2]);
            customEntity.setCvAccepted((Cv) record[3]);
            return customEntity;
        })).collect(Collectors.toList());
    }
}
