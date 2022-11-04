package cinema;

public class Ingresso {

    String nomeEvento;
    double valorIngresso;

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public double getValorIngresso() {
        return valorIngresso;
    }
    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Ingresso(String nomeEvento, double valorIngresso) {
        this.nomeEvento = nomeEvento;
        this.valorIngresso = valorIngresso;
    }

    public void imprimir(){

        System.out.println("Nome do Evento: " + nomeEvento);
        System.out.println("Valor do ingresso: " + valorIngresso);
    } 
    
}
