
package psp5;


public class Orden extends Thread {
    
    public Orden (String str){
        super(str);
    }
    
    /**
     *Hilos
     */
    
    @Override
    public void run(){
        //getName() lo guardo en un String
        String nombre = getName();
        //Condiciones
        if(nombre.equalsIgnoreCase("hilo1")){
            System.out.println("Hola, soy el hilo número 1");
        }else{
            System.out.println("Hola, soy el hilo número 2");
        }
    }
    
    
}
