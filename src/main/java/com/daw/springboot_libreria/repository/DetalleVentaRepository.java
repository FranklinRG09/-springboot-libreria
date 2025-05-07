package com.daw.springboot_libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.springboot_libreria.model.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {}