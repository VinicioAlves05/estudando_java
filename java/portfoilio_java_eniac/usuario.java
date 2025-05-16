package java.portfoilio_java_eniac;

public class usuario {

	 String nome, email, senha;
	   
	    public String getNome(){ return this.nome; }
	    public String getEmail(){ return this.email;}
	    public String getSenha(){ return this.senha;}

	    public void setNome(String _nome){ this.nome = _nome;}
	    public void setEmail(String _email){ this.email = _email;}
	    public void setSenha(String _senha){ this.senha = _senha;}

	    public void cadastrarDenuncia(){
	        System.out.println("Método cadastrar denúncia.");
	    }
	    public void visualizarDenuncia(){
	        System.out.println("Método visualizar denúncia.");
	    }
	    public void curtirDenuncia(){
	        System.out.println("Método curtir denúncia.");
	    }
	    public void comentarDenuncia(){
	        System.out.println("Método comentar denúncia.");
	    }
	    public void responderDenúncia(){
	        System.out.println("Método responder denúncia.");
	    }

}