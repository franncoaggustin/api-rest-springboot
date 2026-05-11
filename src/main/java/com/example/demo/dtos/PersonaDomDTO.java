package com.example.demo.dtos;

import com.example.demo.entities.Domicilio;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonaDomDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private Domicilio domicilio;
}