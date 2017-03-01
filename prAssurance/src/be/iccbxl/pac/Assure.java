package be.iccbxl.pac;
/**
 * @author Viorel FLORICA
 * @version 0.01
 * **/
import java.util.ArrayList;
import java.util.Iterator;


public class Assure {
	//Proprietés 
	private int numeroAssure; //Numéro de l'assuré
	private String nom;
	private String prenom;
	private String nrCptBanque; //compte bancaire iban comancant par le prefix du pays
	private Police police;
	private double rembRecu;
	private ArrayList<Sinistre> sinistres;
	//Constructeurs
	public Assure() {
		super();
		System.out.println("Creation Assuré reusi !" );
	}
	public Assure(int numeroAssure, String nom, String prenom, String nrCptBanque) {
		super();
		this.numeroAssure = numeroAssure;
		this.nom = nom;
		this.prenom = prenom;
		this.nrCptBanque = nrCptBanque;
		this.police = null;
		this.rembRecu = 0.0;
		this.sinistres = new ArrayList<Sinistre>();
		System.out.println("Creation Assuré reusi !" );
	}
	//Getters et setters
	public int getNumeroAssure() {
		return numeroAssure;
	}
	public void setNumeroAssure(int numeroAssure) {
		this.numeroAssure = numeroAssure;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNrCptBanque() {
		return nrCptBanque;
	}
	public void setNrCptBanque(String nrCptBanque) {
		this.nrCptBanque = nrCptBanque;
	}
	public Police getPolice() {
		return police;
	}
	
	public double getRembRecu() {
		return rembRecu;
	}
	public void rembourserAssuré(double rembRecu) {
		this.rembRecu += rembRecu;
	}
	public ArrayList<Sinistre> getSinistres() {
		return sinistres;
	}
	public void setSinistres(ArrayList<Sinistre> sinistres) {
		this.sinistres = sinistres;
	}
	public void  afficherSinistres(){
		System.out.println("Sinistre(s)" );
		for(Iterator iter= this.sinistres.iterator(); iter.hasNext();){
			Sinistre s = (Sinistre) iter.next();
			System.out.println("Nr Sinistre : " +s.getNumero_sinistre());
			System.out.println("Montant Sinistre : " + s.getCout());
		}
	}
	public void ajouterPoliceALAssure(Police police){
		this.police=police;
	}
	public void declarerSinistre(Sinistre s){
		this.sinistres.add(s);
	}
	@Override
	public String toString() {
		return "Assure [numeroAssure=" + numeroAssure + ", nom=" + nom + ", prenom=" + prenom + ", nrCptBanque="
				+ nrCptBanque + ", police=" + police + ", rembRecu=" + rembRecu;
	}
}
