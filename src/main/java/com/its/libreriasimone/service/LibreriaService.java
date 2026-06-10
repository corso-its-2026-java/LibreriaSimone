package com.its.libreriasimone.service;

import entity.Libreria;

import java.util.List;

public interface LibreriaService {
    List<Libreria> getAll();

    String create(Libreria libreria);

}
