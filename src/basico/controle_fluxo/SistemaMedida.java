package basico.controle_fluxo;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default: 
                System.out.println("INDEFINIDO");
                break;
        }
    }
}
