package java.portfoilio_java_eniac;

public class principal {

public static void main(String[]args) {
	
	usuario usuario1 = new usuario();
    usuario1.setNome("Vinicio Alves");
    usuario1.setEmail("vinicioDev@email.com");
    usuario1.setSenha("vinicio2005");
    
    System.out.println("Nome: " + usuario1.nome);
    System.out.println("Email: " + usuario1.email);
    System.out.println("Senha: " + usuario1.senha);
    System.out.println("...........");
    
    usuario1.cadastrarDenuncia();
    usuario1.visualizarDenuncia();
    usuario1.comentarDenuncia();
    usuario1.curtirDenuncia();
    usuario1.responderDenúncia();
    System.out.println(".");
    System.out.println(".");
    
    denuncia denuncia1 = new denuncia();
    denuncia1.setIdDenuncia("01");
    denuncia1.setdataDenuncia("04/11/2024");
    denuncia1.setDescricao("Buraco aberto na rua Mario Lago, no bairro Jardim Munira em Guarulhos, causado por chuvas fortes.");
    
    System.out.println("Id: " + denuncia1.idDenuncia);
    System.out.println("Descrição: " + denuncia1.descricao);
    System.out.println("Data: " + denuncia1.dataDenuncia);
    System.out.println("...........");
    
    denuncia1.descricaoDenuncia();
    denuncia1.dataDenuncia();
    System.out.println(".");
    System.out.println(".");
    
    solução solução1 = new solução();
    solução1.setPlanejamento("Escolher a equipe tercerizada para o trabalho e agendar o dia da execução.");
    solução1.setExecucao("Ir com máquinas no local informado para tampar o buraco.");
    solução1.setDataExecucao("07/01/2025");
    
    System.out.println("Planejamento: " + solução1.planejamento);
    System.out.println("Execução: " + solução1.execucao);
    System.out.println("Data: " + solução1.dataExecucao);
    System.out.println("...........");
    
    solução1.planejamento();
    solução1.execucao();
 
    
    
  
    
 
   
   
  
}

}
