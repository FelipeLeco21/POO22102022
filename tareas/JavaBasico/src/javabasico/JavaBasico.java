/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author felip
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad= 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.print(x);
        String dias = "23";
        
        System.out.println(dias +3);
        int temp = Integer.parseInt(dias);
        System.out.println("Dias = "+ (temp +3));
                
       
        Perro dog1 = new Perro("Poddle",1);
        System.out.println(dog1);
        System.out.println(Perro.cola);
        System.out.println(dog1.cola);
        
        Perro.ladrar();
        dog1.ladrar();
        
        String cad1 ="Hola";
        String cad2 ="Mundo";
        String cad3 = cad1 + cad2;
        System.out.println( cad3);
        System.out.println("Edad :" + edad + "años");
        
        String res ="";
        if (edad >= 18){
            res = "Mayor de edad";
        }else{
            res ="Menor de edad";
        }
        System.out.println("Eres:"+ res);
        
        System.out.println("----");
        edad = 15;
        res = (edad >= 18)?"Mayor de edad":"Menor de edad";
        System.out.println("Eres:"+ res);
        
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);
        /*
        val1 = 000...0111
        val2 = 000...0010
        -----------------
               000...0010 // 2 decimal
       
        */
        // desplazamiento a nivel de bits
        
        int val3 =1; //000...0001
        int val4 = val3<<1; //desplazar los bits a la posicion a la 1zq
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        System.out.println("--- arreglos---");
        
        int[] edades; //solo se declara
        int[] edades2 = new int [5];// se declara y reserva memoria
        int[] edades3 = {22,21,18,19,18 }; // se reservan e inicializa
        
        /*
        Se usa como en c, c++, etc...
        */
        edades2[0]=33;
        System.out.println(edades2[0]);//33
        System.out.println(edades2[1]);//0
        //imprimimos edades3
        System.out.println("Edades 3 a mano");
        System.out.println(edades3[0]);
        System.out.println(edades3[1]);
        System.out.println(edades3[2]);
        System.out.println(edades3[3]);
        System.out.println(edades3[4]);
        //
        System.out.println("Automatizado");
        for (int i = 0; i < edades3.length; i++) {
            int j = edades3[i];
            
           System.out.println(edades3[i]);
           
            //inverso
            
         System.out.println("orden inverso ");
        for (int k = edades3.length-1; k >= 0; k--) {
            System.out.println(edades3[k]);
        }
        
        System.out.println("edades a 18");
        for (int l = 0; l < edades3.length; l++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
        }
            System.out.println("con each");
            for (int ed : edades3) {
                System.out.println(ed);
                
                
            }
                      
            
            
            System.out.println("Arreglo de la clase perro");
            
            Perro[] lista = new Perro [3];
            lista[0] = new Perro("Poddle",1);
            lista[0] = new Perro("San bernardo",3);
            lista[0] = new Perro("Akira",2);
            
            for (Perro perro : lista) {
                perro.comer();
                
            }
            
            System.out.println("Todos los perros a Doverman");
            
            for(Perro perro : lista){
                perro.setRaza("Doverman");
                
            
            }
             for (Perro perro : lista){
                 System.out.println(perro);
             }
        
            

}
    }
}


