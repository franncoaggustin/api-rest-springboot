package com.example.demo.controllers;

import com.example.demo.entities.Domicilio;
import com.example.demo.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {

    public DomicilioController(DomicilioServiceImpl domicilioServiceImpl) {
        super(domicilioServiceImpl);
    }
}