package com.hospital.patients.service;

import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //  il reçois les donné du controlleur
public class PatientService {

    @Autowired
    PatientModel patientModel;
    public String printName(String name)
    {
        String s = patientModel.getNames().stream().filter(i -> i==name)
                .findAny().orElse("nothing");
        System.out.println("helloo");
        return s.toUpperCase();
    }
}
