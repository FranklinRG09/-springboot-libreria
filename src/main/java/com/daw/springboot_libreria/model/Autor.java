package com.daw.springboot_libreria.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;
}
