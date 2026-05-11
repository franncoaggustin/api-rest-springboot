package com.example.demo.services;

import com.example.demo.dtos.PersonaBasicaDTO;
import com.example.demo.dtos.PersonaDTO;
import com.example.demo.dtos.PersonaDomDTO;
import com.example.demo.entities.Persona;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.PersonaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<PersonaBasicaDTO> findAllBasica() throws Exception {
        try {
            List<Persona> personas = baseRepository.findAll();
            List<PersonaBasicaDTO> dtos = new ArrayList<>();
            ModelMapper modelMapper = new ModelMapper();
            for (Persona persona : personas) {
                dtos.add(modelMapper.map(persona, PersonaBasicaDTO.class));
            }
            return dtos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<PersonaDTO> findAllCompleta() throws Exception {
        try {
            List<Persona> personas = baseRepository.findAll();
            List<PersonaDTO> dtos = new ArrayList<>();
            ModelMapper modelMapper = new ModelMapper();
            for (Persona persona : personas) {
                dtos.add(modelMapper.map(persona, PersonaDTO.class));
            }
            return dtos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<PersonaDomDTO> findAllConDom() throws Exception {
        try {
            List<Persona> personas = baseRepository.findAll();
            List<PersonaDomDTO> dtos = new ArrayList<>();
            ModelMapper modelMapper = new ModelMapper();
            for (Persona persona : personas) {
                dtos.add(modelMapper.map(persona, PersonaDomDTO.class));
            }
            return dtos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            //List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Persona> personas = personaRepository.search(filtro);
            List<Persona> personas = personaRepository.searchNativo(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Persona> personas = personaRepository.search(filtro, pageable);
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}