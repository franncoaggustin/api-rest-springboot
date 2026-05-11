package com.example.demo.services;

import com.example.demo.dtos.AutorLibroDTO;
import com.example.demo.entities.Autor;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long> {
    List<AutorLibroDTO> findAllConLibros() throws Exception;
}