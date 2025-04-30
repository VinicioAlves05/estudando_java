package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        SelecaoCandidatos();
    }
    static void SelecaoCandidatos(){

        String [] candidatos = {"Vinicio", "Gustavo", "Thiago", "Kawendelle", "Douglas", "Nathan", "Wallace", "Gabriel", "Julio", "Roberto"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
       
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
          String candidato = candidatos[candidatosAtual];
          double salarioPretendido = valorPretendido(); 

          System.out.println("O CANDIDATO " + candidato + " SOLICITOU ESTE VALOR DE SALÁRIO " + salarioPretendido);
          if(salarioBase >= salarioPretendido){
            System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO PARA A VAGA");
            candidatosSelecionados++;
          }
          candidatosAtual++;
        }
    }
    static double valorPretendido(){
        //Esta função serve para dar números aleatórios ao programa (Neste caso, dando o valor dos salários pedido pelos candidatos em forma aleatória)
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
