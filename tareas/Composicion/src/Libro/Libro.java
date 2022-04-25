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
public class Libro {
    private Editorial nEditorial;
    private Autor nAutor ;

    public Libro() {
    }

    public Libro(Editorial nEditorial, Autor nAutor) {
        this.nEditorial = nEditorial;
        this.nAutor = nAutor;
    }

    public Autor getNAutor() {
        return nAutor;
    }

    public void setNAutor(Autor nAutor) {
        this.nAutor = nAutor;
    }

    public Editorial getNEditorial() {
        return nEditorial;
    }

    public void setNEditorial(Editorial nEditorial) {
        this.nEditorial = nEditorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nEditorial=" + nEditorial + ", nAutor=" + nAutor + '}';
    }
  

            
    
}
