package be.iccbxl.pac;
/**
 * @author Viorel FLORICA
 * @version 0.01
 * **/
public class Risque {
	//Proprietés
	private Police num_police;
	private Dommage dommage;
	//Constructeurs
	public Risque() {
		super();
	}
	public Risque(Police num_police, Dommage dommage) {
		super();
		this.num_police = num_police;
		this.dommage = dommage;
	}
	//Getters and setters
	public Police getNum_police() {
		return num_police;
	}
	public void setNum_police(Police num_police) {
		this.num_police = num_police;
	}
	public Dommage getDommage() {
		return dommage;
	}
	public void setDommage(Dommage dommage) {
		this.dommage = dommage;
	}
	
}
