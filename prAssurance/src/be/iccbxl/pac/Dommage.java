package be.iccbxl.pac;
/**
 * @author Viorel FLORICA
 * @version 0.01
 * **/
public class Dommage{
	//Proprietés
	private String nom;
	private boolean couvert;
	//Constructeurs
	public Dommage() {
		super();
	}
	public Dommage(String nom, boolean couvert) {
		super();
		this.nom = nom;
		this.couvert = couvert;
	}
	//Getters et Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isCouvert() {
		return couvert;
	}
	public void setCouvert(boolean couvert) {
		this.couvert = couvert;
	}
	@Override
	public String toString() {
		return "Dommage [nom=" + nom + ", couvert=" + couvert + "]";
	}
	
	
	
}
