
package psp5;


public class PSP5 {


    public static void main(String[] args) {
        //Declaro los hilos y ordeno sus prioridades
        Thread hilo1 = new Orden ("hilo1");
        hilo1.setPriority(1);
        Thread hilo2 = new Orden("hilo2");
        hilo2.setPriority(10);
        //Inicializo los hilos
        hilo1.start();
        hilo2.start();
    }
    
}
