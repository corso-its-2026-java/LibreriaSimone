package com.its.libreriasimone.controller;

import com.its.libreriasimone.service.LibreriaService;
import entity.Libreria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/libreria")
public class LibreriaController {

    @Autowired
    private LibreriaService libreriaService;

    @GetMapping("/elenco")
    public List<Libreria> getAll() {

        return libreriaService.getAll();
    }

    @PostMapping("/salva-libro")
    public String create(@RequestBody Libreria libreria) {

        return libreriaService.create(libreria);
    }
}
