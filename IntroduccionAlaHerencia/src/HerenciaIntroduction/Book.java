/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaIntroduction;

/**
 *
 * @author Cesar
 */
public abstract  class Book {
    private String titulo;
    private Double precio;

    public Book(String titulo, Double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public abstract Double setPrice();
    
    
}
