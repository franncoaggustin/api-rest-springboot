package com.example.demo.controllers;

import com.example.demo.entities.Autor;
import com.example.demo.services.AutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

    public AutorController(AutorServiceImpl autorServiceImpl) {
        super(autorServiceImpl);
    }

    @GetMapping("/conlibros")
    public ResponseEntity<?> getAllConLibros() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllConLibros());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }
}