package com.example.demo.services;

import com.example.demo.dtos.PersonaBasicaDTO;
import com.example.demo.dtos.PersonaDTO;
import com.example.demo.dtos.PersonaDomDTO;
import com.example.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    List<PersonaBasicaDTO> findAllBasica() throws Exception;
    List<PersonaDTO> findAllCompleta() throws Exception;
    List<PersonaDomDTO> findAllConDom() throws Exception;

    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}