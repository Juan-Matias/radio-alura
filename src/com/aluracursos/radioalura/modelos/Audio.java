package com.aluracursos.radioalura.modelos;

public abstract class Audio {
    private String titulo;
    private int totalDeMegusta;
    private int totalDeReproducciones;

    // Métodos abstractos para ser implementados por las subclases
    public abstract int getClasificacion();

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    // Métodos de incremento
    public void meGusta() {
        totalDeMegusta++;
    }

    public void reproduce() {
        totalDeReproducciones++;
    }
}
