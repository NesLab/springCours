package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // on l'utilise pour tout sauf le service, pour differencier avec le service
public class PatientModel {

    List<String> names = new ArrayList<>();

    PatientModel()
    {
        names.add("Nesrine");
        names.add("Cici");
        names.add("malik");
    }
    public List<String> getNames()
    {
        return names;
    }
}
