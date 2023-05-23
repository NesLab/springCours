package com.hospital.patients.controller;

import com.hospital.patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 1. je lui dit je veux que tu sois un rest controlleur
@RequestMapping("/patients") // ça veut dire que dans le lien on doit avoir toujours /patients
public class PatientController {

    @Autowired // si comme si j'ai declaré le service dans le constructeur ! permet d'activer l'injection automatique de dépendance.
    private PatientService patientService;  //Bean
    @GetMapping("/print-name") // on ajoute au lien localhost:8080
    public void printPatient()
    {
        System.out.println(("print my Name"));  // il va l'ecrire dans la console mais pas coté chrom
    }

    @GetMapping("/print-name-str")
    public String printPatientStr()
    {  // le retour va l'afficher dans le browsers
        return patientService.printName("Labdi Nesrine"); // on donne le nom au service, et lui il fait ce qu'il veut
    }
}
