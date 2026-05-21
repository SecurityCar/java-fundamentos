package basico.controle_fluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.5;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }
}
