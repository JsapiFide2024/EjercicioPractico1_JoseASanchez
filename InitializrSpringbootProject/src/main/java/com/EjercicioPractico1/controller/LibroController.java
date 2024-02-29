/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibrosService librosService;

    @GetMapping("/libros")
    public String listarLibros(@RequestParam(required = false) String categoria, Model model) {
        List<Libros> libros;
        libros = librosService.getLibros();
        model.addAttribute("libros", libros);
        return "listadoLibros";
    }
}
