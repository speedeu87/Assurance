package be.iccbxl.pac;
/**
 * @author Viorel FLORICA
 * @version 0.01
 * **/
import java.util.Date;

public class Police {
	//Propriétés
	private int numero_police;
	private Date date_debut;
	private Date date_fin;
	private double prix;//cout annuel de la prime
	
	// Constructeurs
	public Police() {
		super();
		System.out.println("Creation Police reusi !" );
	}
	public Police(int numero_police, Date date_debut, Date date_fin, double prix) {
		super();
		this.numero_police = numero_police;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prix = prix;
		System.out.println("Creation Police reusi !" );
	}
	//Getters et setters
	public int getNumero_police() {
		return numero_police;
	}
	public void setNumero_police(int numero_police) {
		this.numero_police = numero_police;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double rembourser(Sinistre s){
		return s.getCout();
	}
	@Override
	public String toString() {
		return "Police [numero_police=" + numero_police + ", date_debut=" + date_debut + ", date_fin=" + date_fin
				+ ", prix=" + prix + "]";
	}
	
	
	
}
