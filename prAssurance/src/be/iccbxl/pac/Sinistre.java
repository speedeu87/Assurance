package be.iccbxl.pac;
/**
 * @author Viorel FLORICA
 * @version 0.01
 * **/
import java.util.Date;

public class Sinistre {
	// Proprietés
	private int numero_sinistre;
	private Date date;
	private Dommage dommage;
	private Assure assure;
	private Police police;
	private double cout;
	//Constructeur;
	public Sinistre() {
		super();
		System.out.println("Creation Sinistre reusi !" );
	}
	public Sinistre(int numero_sinistre, Date date, Dommage dommage, Assure assure, Police police, double cout) {
		super();
		this.numero_sinistre = numero_sinistre;
		this.date = date;
		this.dommage = dommage;
		this.assure = assure;
		this.police = police;
		this.cout = cout;
		System.out.println("Creation Sinistre reusi !" );
	}
	//Getters et setters
	public int getNumero_sinistre() {
		return numero_sinistre;
	}
	public void setNumero_sinistre(int numero_sinistre) {
		this.numero_sinistre = numero_sinistre;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Dommage getDommage() {
		return dommage;
	}
	public void setDommage(Dommage dommage) {
		this.dommage = dommage;
	}
	public Assure getAssure() {
		return assure;
	}
	public void setAssure(Assure assure) {
		this.assure = assure;
	}
	public Police getPolice() {
		return police;
	}
	public void setPolice(Police police) {
		this.police = police;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	/**
	@Override
	public String toString() {
		return "Sinistre [numero_sinistre=" + numero_sinistre + ", date=" + date + ", dommage=" + dommage + ", assure="
				+ assure + ", police=" + police + ", cout=" + cout + "]";
	} **/
	
	
	
	
	
}
