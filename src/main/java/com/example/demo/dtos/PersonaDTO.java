package com.example.demo.dtos;

import com.example.demo.entities.Domicilio;
import com.example.demo.entities.Libro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private Domicilio domicilio;
    private List<Libro> libros;
}