
package psp5;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;


public class PSP5 {


    public static void main(String[] args) {
        //Declaro los hilos y ordeno sus prioridades
        Thread hilo1 = new Orden ("hilo1");
        hilo1.setPriority(MIN_PRIORITY);
        Thread hilo2 = new Orden("hilo2");
        hilo2.setPriority(MAX_PRIORITY);
        //Inicializo los hilos
        hilo1.start();
        hilo2.start();
    }
    
}
