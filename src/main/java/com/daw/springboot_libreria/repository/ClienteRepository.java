package com.daw.springboot_libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.springboot_libreria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}