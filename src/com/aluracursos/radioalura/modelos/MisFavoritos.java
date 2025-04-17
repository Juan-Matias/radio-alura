package com.aluracursos.radioalura.modelos;

import java.util.ArrayList;
import java.util.List;

public class MisFavoritos {
    private List<Audio> favoritos = new ArrayList<>();

    public void adiciona(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            favoritos.add(audio);
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " también es uno de los favoritos");
        }
    }

    public void mostrarFavoritos() {
        System.out.println("\n🎧 Lista de favoritos:");
        for (Audio favorito : favoritos) {
            System.out.println("- " + favorito.getTitulo() + " (Clasificación: " + favorito.getClasificacion() + ")");
        }
    }
}
