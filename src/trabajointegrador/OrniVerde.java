
package trabajointegrador;

import java.util.Scanner;


public class OrniVerde extends PapaCastor implements MamaPata {

    public OrniVerde() {}
    
    @Override
    public void tocarOrgano() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Do-Re-Mi");
        System.out.println("Toque la tecla 'f' ");
        String tecla = leer.next();
        
        System.out.println("Fa-Sol-La-Si");
        System.out.println("......");
    }
   
    public void tocarGuitorgan (){
             super.tocarGuitarra();
             tocarOrgano();
        System.out.println("Cuak cuaK ");
        System.out.println("cuak");
    }
}
