public class SistemaIbge {

    public static void main(String[] args) {
        
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {

            System.out.println(e.getSigla() + " - " + e.getNome());

        }

        System.out.println("-----------------------------------------------------------------------------------------------");

        EstadoBrasileiro eb = EstadoBrasileiro.MINAS_GERAIS;
        System.out.println(eb.getNome() + " - " + eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());

    }

}
