package com.example.demo.controllers;

import com.example.demo.entities.Libro;
import com.example.demo.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {

    public LibroController(LibroServiceImpl libroServiceImpl) {
        super(libroServiceImpl);
    }
}