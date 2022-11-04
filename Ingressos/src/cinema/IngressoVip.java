package cinema;

public class IngressoVip extends Ingresso {

    double adicional;
 
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }


    public IngressoVip(String nomeEvento, double valorIngresso, double adicional) {
        super(nomeEvento, valorIngresso);
        this.adicional = adicional;
    }

    @Override
    
    public void imprimir() {

        super.imprimir();
        System.out.println("Valor adicional: " + adicional);
        System.out.println("Total a pagar: " + (valorIngresso + adicional));

    }
    
}
