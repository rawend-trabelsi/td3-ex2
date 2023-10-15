package ex2;

public class MotDico {
	private static int count;
	private int  num;
	private String mot;
	private String definition;
	public int getNum() {
		return num;
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public boolean synonyme (MotDico m) {
	
		return m.getMot()==(this.mot);
	

}
}
