package com.aluracursos.radioalura.modelos;

public class Cancion extends Audio {
    private String album;
    private String cantante;
    private String genero;

    // Constructor privado para asegurar el uso del Builder
    private Cancion() {
    }

    // Método sobrescrito para calcular clasificación
    @Override
    public int getClasificacion() {
        return getTotalDeMegusta() > 5000 ? 8 : 4;
    }

    // Getters
    public String getAlbum() {
        return album;
    }

    public String getCantante() {
        return cantante;
    }

    public String getGenero() {
        return genero;
    }

    // Setters privados para asegurar inmutabilidad después de construir
    private void setAlbum(String album) {
        this.album = album;
    }

    private void setCantante(String cantante) {
        this.cantante = cantante;
    }

    private void setGenero(String genero) {
        this.genero = genero;
    }

    // toString personalizado para imprimir toda la info
    @Override
    public String toString() {
        return "🎵 Cancion{" +
                "titulo='" + getTitulo() + '\'' +
                ", cantante='" + cantante + '\'' +
                ", album='" + album + '\'' +
                ", genero='" + genero + '\'' +
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
        private final String cantante;
        private String album;
        private String genero;

        // Constructor del Builder con los campos obligatorios
        public Builder(String titulo, String cantante) {
            this.titulo = titulo;
            this.cantante = cantante;
        }

        // Métodos para agregar campos opcionales
        public Builder album(String album) {
            this.album = album;
            return this;
        }

        public Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        // Método que construye finalmente el objeto Cancion
        public Cancion build() {
            Cancion cancion = new Cancion();
            cancion.setTitulo(titulo);         // heredado de Audio
            cancion.setCantante(cantante);
            cancion.setAlbum(album);
            cancion.setGenero(genero);
            return cancion;
        }
    }
}
