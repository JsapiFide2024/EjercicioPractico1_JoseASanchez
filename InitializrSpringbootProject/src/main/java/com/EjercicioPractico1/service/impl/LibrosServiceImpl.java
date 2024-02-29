/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.LibrosDao;
import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibrosServiceImpl implements LibrosService {

    @Autowired
    private LibrosDao librosDao;

    @Override
    @Transactional(readOnly = true)
    public List<Libros> getLibros(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            return librosDao.findByCategoria(categoria);
        } else {
            return librosDao.findAll();
        }
    }

    @Override
    @Transactional
    public void guardarlibro(Libros libro) {
        librosDao.save(libro);
    }

    @Override
    @Transactional
    public void eliminarlibro(Libros libro) {
        librosDao.delete(libro);
    }

    @Override
    @Transactional(readOnly = true)
    public Libros obtenerLibroPorId(Long id) {
        return librosDao.findById(id).orElse(null);
    }
}