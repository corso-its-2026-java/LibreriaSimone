package com.its.libreriasimone.service.serviceImpl;

import com.its.libreriasimone.service.LibreriaService;
import entity.Libreria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibreriaServiceImpl implements LibreriaService {

    private List<Libreria> librerie = new ArrayList<>();

    public LibreriaServiceImpl () {
        Libreria libreria = new Libreria();
        libreria.setId(1);
        libreria.setAutore("Simone");
        libreria.setTitolo("AmatiSempre");
        libreria.setCodice(12345);
        librerie.add(libreria);

        Libreria libreria2 = new Libreria();
        libreria2.setId(2);
        libreria2.setAutore("Pietro");
        libreria2.setTitolo("Java");
        libreria2.setCodice(34567);
        librerie.add(libreria2);
    }

    @Override
    public List<Libreria> getAll() {
        return librerie;
    }

    @Override
    public String create(Libreria libreria) {

        if (libreria != null) {
            for (Libreria libroLista : librerie) {
                if (libreria.getId() == libroLista.getId() || libreria.getCodice() == libroLista.getCodice()) {
                    return "Errore impossibile registrare libro con id o codice gia esistente!";
                }
            }


            if (libreria.getAutore() != null && libreria.getTitolo() != null && libreria.getId() > 0 && libreria.getCodice() > 0) {
                librerie.add(libreria);
                return "Libro registrato con successo!";
            } else {
                return "Impossibile registrare il libro : Valorizzare tutti i campi e inserire id e codice maggiore di 0!";
            }
        } else {
            return "Impossibile registrare il libro!";
        }
    }
}

