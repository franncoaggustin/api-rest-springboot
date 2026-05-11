package com.example.demo.dtos;

import com.example.demo.entities.Libro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AutorLibroDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String biografia;
    private List<Libro> libros;
}