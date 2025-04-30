package candidatura;

public class ProcessoSeletivo3 {
    public static void main(String[] args) {
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){

        String [] candidatos = {"VINICIO", "GUSTAVO", "THIAGO", "KAWENDELLE", "DOUGLAS"};
        System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS INFORMANDO O INDICE DO ELEMENTO");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O CANDIDATO DE N° " + (indice+1) + " É O " + candidatos[indice]);
        }
        
    //Forma abreviada de usar o For

        System.out.println("FORMA ABREVIADA DE INTERAÇÃO FOR EATC");

        for(String candidato: candidatos){
            System.out.println("O CANDIDATO SELECIONADO É " + candidato);
        }
    }
}
