package basico.controle_fluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("O aluno passou com rendimento bom!");
        }else if (nota >= 5 && nota < 7){
            System.out.println("O aluno passou com rendimento mediano.");
        }else{
            System.out.println("O aluno foi reprovado.");
        }
    }
}
