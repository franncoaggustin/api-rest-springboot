package com.example.demo.services;

import com.example.demo.dtos.AutorLibroDTO;
import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import com.example.demo.repositories.BaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }

    @Override
    public List<AutorLibroDTO> findAllConLibros() throws Exception {
        try {
            List<Autor> autores = baseRepository.findAll();
            List<AutorLibroDTO> dtos = new ArrayList<>();
            ModelMapper modelMapper = new ModelMapper();
            for (Autor autor : autores) {
                dtos.add(modelMapper.map(autor, AutorLibroDTO.class));
            }
            return dtos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}