package java.portfoilio_java_eniac;

public class solução {

	String planejamento, execucao, dataExecucao;
	
	public String getPlanejamento() { return this.planejamento; }
	public String getExecucao() { return this.execucao; }
	public String getDataExecucao() { return this.dataExecucao; }
	
	public void setPlanejamento(String _planejamento) { this.planejamento = _planejamento; }
	public void setExecucao(String _execucao) { this.execucao = _execucao; }
	public void setDataExecucao(String _dataExecucao) { this.dataExecucao = _dataExecucao; }
	
	public void planejamento() {
		System.out.println("Método planejamento");
	}
	
	public void execucao() {
		System.out.println("Método execução");
	}
	
}
