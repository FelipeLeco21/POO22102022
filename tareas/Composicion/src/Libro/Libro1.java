/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import Datos.Autor;
import Datos.Editorial;

/**
 *
 * @author felip
 */
public class Libro1 {
    
    private Editorial editorial;
    private Autor autor;

    public Libro1() {
    }

    public Libro1(Editorial editorial, Autor autor) {
        this.editorial = editorial;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro1{" + "editorial=" + editorial + ", autor=" + autor + '}';
    }

    public static class setAutor {

        public setAutor() {
        }
    }
    
            
}
