/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

/**
 *
 * @author Fabian
 */
public class Libro {
    private String titulo;
    private String Autor;
    private String isbn;
    private String editorial;
    private int edicion;
    private float precio;

    public Libro() {
    }

    public Libro(String titulo, String Autor, String isbn, String editorial, int edicion, float precio) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.edicion = edicion;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", Autor=" + Autor + ", isbn=" + isbn + ", editorial=" + editorial + ", edicion=" + edicion + ", precio=" + precio + "}";
    }
    
}
