package trabajointegrador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el tamaño de la cola...");
      
        double cola = leer.nextDouble();
        PapaCastor elPadrino = new PapaCastor(cola);
        
     
        
        System.out.println("............................................");
        
        System.out.println("Ingrese la velocidad de propulsion para blue");
        double propulsion = leer.nextDouble();
        OrniAzul blue = new OrniAzul(propulsion);
         blue.nadar();
         blue.tocarGuitarra();
         System.out.println();
         
        System.out.println("Ingrese la velocidad de propulsion para blui");
        double propulsion1 = leer.nextDouble();
        OrniAzul blui = new OrniAzul(propulsion1);
        blui.nadar();
        blui.tocarGuitarra();
        System.out.println();
        System.out.println("........................................");
        OrniVerde perry = new OrniVerde();
        perry.tocarGuitorgan();
        perry.tocarOrgano();
       try{ 
      PapaCastor [] hermandad = new PapaCastor [3];   
      hermandad[0] = perry;
      hermandad[1] = blue;
      hermandad[2] = blui;
       }catch(ArrayIndexOutOfBoundsException a){
           System.out.println("Fuera del indice...");
       }finally{
           System.out.println("Los ornitoHemanos estan juntos!!");
       }
    }

}
