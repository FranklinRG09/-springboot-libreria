package com.daw.springboot_libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.springboot_libreria.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {}
