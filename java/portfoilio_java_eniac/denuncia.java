package java.portfoilio_java_eniac;

public class denuncia {

	String idDenuncia, descricao, dataDenuncia;
	
	public String getIdDenuncia(){return this.idDenuncia;}
	public String getDescricao() {return this.descricao;}
	public String getDataDenuncia() {return this.dataDenuncia;}
	
    public void setIdDenuncia(String _idDenuncia){ this.idDenuncia = _idDenuncia;}
    public void setDescricao(String _descricao){ this.descricao = _descricao;}
    public void setdataDenuncia(String _dataDenuncia){ this.dataDenuncia = _dataDenuncia;}
    
    public void descricaoDenuncia() {
    	System.out.println("Descrição cadastrada.");
    }
    public void dataDenuncia() {
    	System.out.println("Data registrada.");
    }

}
