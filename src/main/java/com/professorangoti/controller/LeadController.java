package com.professorangoti.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professorangoti.domain.Lead;
import com.professorangoti.repository.LeadRepository;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class LeadController extends GenericController<Lead> {

    // Spring injeta o repositório no construtor. Dispensa o uso do @Autowired
    // Implicit Constructor Injection
    public LeadController(LeadRepository leadRepository) {
        super(leadRepository);
    }
}
