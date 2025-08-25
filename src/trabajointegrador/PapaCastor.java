
package trabajointegrador;


public class PapaCastor {
   
    private double cola;
    private double velocidad ;

    public PapaCastor() { }

    
    public PapaCastor(double cola) {
        this.cola = cola;
        this.velocidad=velocidad;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    
    
    public void nadar(){
     int random = (int)(Math.random() * 9 );
     if( random!= 0){
    System.out.println("Toy nadando a una velocidad de: " + random + " km/h" );
    this.setVelocidad(random);
     }else {
         System.out.println("Ta morido");
     }
    }
    public void tocarGuitarra(){
        int cuerda = 0;
        for (int i = 0; i < 3; i++) {
           int ram = (int) (Math.random() * 6 ) + 1 ;
            cuerda = ram ;
            System.out.println("Tocaste la cuerda " + cuerda);
            System.out.println("despierta los vecinos con los ruidos ");
        }
      
    }
    
}
