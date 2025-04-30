package aulas_poo;

public class Principal {
    public static void main(String[] args) {
        //Criando o objeto da classe Cao
        Cao dog1 = new Cao();

        //Carregando os métodos (chamando os métodos)
        dog1.setAltura(1.5);
        dog1.setPeso(15.90);
        dog1.setComida("Ração + petisco");

        //Carregando os métodos (chamando os métodos)
        dog1.Correr();
        dog1.Latir();
        Cao.Morder(); //O método morder está no modo static, para declarar é necessário chamar o nome da Classe

        Cao dog2 = new Cao();

        dog2.setAltura(1.8);
        dog2.setPeso(18.5);

        dog2.Correr();
        dog2.Latir();
        Cao.Morder(); //O método morder está no modo static, para declarar é necessário chamar o nome da Classe
    }
}
