package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;

    // Constructor privado para asegurar el uso del Builder
    private Podcast() {
    }

    // Método sobrescrito para calcular clasificación
    @Override
    public int getClasificacion() {
        return getTotalDeReproducciones() >= 2000 ? 9 : 2;
    }

    // Getters
    public String getPresentador() {
        return presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters privados para asegurar inmutabilidad después de construir
    private void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // toString personalizado para imprimir toda la info
    @Override
    public String toString() {
        return "Podcast{" +
                "titulo='" + getTitulo() + '\'' +
                ", presentador='" + presentador + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", me gusta=" + getTotalDeMegusta() +
                ", reproducciones=" + getTotalDeReproducciones() +
                ", clasificación=" + getClasificacion() +
                '}';
    }

    // -----------------------------------
    // 🧱 Clase Builder interna y estática
    // -----------------------------------
    public static class Builder {
        private final String titulo;
        private final String presentador;
        private String descripcion;

        // Constructor del Builder con los campos obligatorios
        public Builder(String titulo, String presentador) {
            this.titulo = titulo;
            this.presentador = presentador;
        }

        // Métodos para agregar campos opcionales
        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        // Método que construye finalmente el objeto Podcast
        public Podcast build() {
            Podcast podcast = new Podcast();
            podcast.setTitulo(titulo);           // heredado de Audio
            podcast.setPresentador(presentador);
            podcast.setDescripcion(descripcion);
            return podcast;
        }
    }
}
