
package trabajointegrador;


public class OrniAzul extends PapaCastor{
    private double propulsion;

    public OrniAzul() {}

    public OrniAzul(double propulsion) {
        this.propulsion = propulsion;
    }

    public OrniAzul(double propulsion, double cola, double velocidad) {
        super(cola);
        this.propulsion = propulsion;
    }

    

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }
    
    @Override
    public void nadar(){
        System.out.println("La velocidad del padre.");
        super.nadar();
        System.out.println("La velocidad del hijo.");
        double velo = super.getVelocidad();
    double velocidadNueva  = velo + propulsion;
    System.out.println("Toy nadando a una velocidad " + velocidadNueva + " km/s");
    
   }
    
    
}
