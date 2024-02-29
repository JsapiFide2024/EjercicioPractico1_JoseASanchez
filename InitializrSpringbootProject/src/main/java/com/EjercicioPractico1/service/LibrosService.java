/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Libros;

import java.util.List;

public interface LibrosService {
    List<Libros> getLibros(String categoria);
    void guardarlibro(Libros libro);
    void eliminarlibro(Libros libro);
    Libros obtenerLibroPorId(Long id);
}
