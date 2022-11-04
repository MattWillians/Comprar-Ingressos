package cinema;

public class MenuCinema {
    public static void main(String[] args) throws Exception {

        System.out.println("----------------------------");
        Ingresso ing = new Ingresso("Rock in Rio", 200);
        ing.imprimir();
        System.out.println("-------------------------");

        IngressoVip ingVip = new IngressoVip("Rock in Rio  - Vip Pass", 200, 50);
        ingVip.imprimir();
        System.out.println("----------------------------");

    }
}
