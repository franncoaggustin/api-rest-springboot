package com.example.demo.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonaBasicaDTO {
    private Long id;
    private String nombre;
    private String apellido;
}