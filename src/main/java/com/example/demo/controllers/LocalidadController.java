package com.example.demo.controllers;

import com.example.demo.entities.Localidad;
import com.example.demo.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {

    public LocalidadController(LocalidadServiceImpl localidadServiceImpl) {
        super(localidadServiceImpl);
    }
}