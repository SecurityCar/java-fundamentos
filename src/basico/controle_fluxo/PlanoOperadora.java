package basico.controle_fluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        String sigla = "T";

        switch (sigla) {
            case "T":
                System.out.println("5Gb de YouTube");
            case "M":
                System.out.println("WhatsApp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Escolha um plano!");
                break;
        }
    }
}
