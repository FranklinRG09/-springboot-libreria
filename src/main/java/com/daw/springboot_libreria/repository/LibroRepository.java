package com.daw.springboot_libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.springboot_libreria.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {}
