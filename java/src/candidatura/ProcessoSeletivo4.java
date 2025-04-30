package candidatura;

import java.util.Random;

public class ProcessoSeletivo4 {
    public static void main(String[] args) {
       
        String [] candidatos = {"VINICIO", "GUSTAVO", "THIAGO", "KAWENDELLE", "DOUGLAS"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
    }
    static void entrandoEmContato (String candidato){
       
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
          atendeu = atender();
          continuarTentando = !atendeu;
          if(continuarTentando){
            tentativasRealizadas++;}
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
                }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA");
        }
        else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS");
        }
    }
    static boolean atender(){
        return new Random().nextInt(3) ==1 ;
    }
}
