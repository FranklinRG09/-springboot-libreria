package com.daw.springboot_libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.springboot_libreria.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {}
