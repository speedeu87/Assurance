package be.iccbxl.pac;

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/** Program Principal **/
		
		// Creation de l'assuré
		Assure viorelFLORICA = new Assure(1234, "Florica", "Viorel", "BE34 2345 2345 2345");
		//affichage assuré apres creation
		System.out.println(viorelFLORICA);
		// Creation d'une Police
		Police police1329 = new Police(1329, new Date(2017, 02, 13), new Date(2018,02,12), 900);
		// On attribute la police à l'assuré
		viorelFLORICA.ajouterPoliceALAssure(police1329);
		//creation d'un damage
		Dommage dom = new Dommage("Vitre brisé", true);
		//Declaration d'un Sinistre
		viorelFLORICA.declarerSinistre(new Sinistre(1290, new Date(), dom, viorelFLORICA, police1329, 1200));
		//Attribution du remboursement de l'assureur !
		viorelFLORICA.rembourserAssuré(viorelFLORICA.getSinistres().get(0).getCout());
		//affichage de l'assuré avec les données
		System.out.println(viorelFLORICA);
		viorelFLORICA.afficherSinistres();
		// Ajout d'un 2e Sinistre
		System.out.println("_____________");
		System.out.println("Ajout du 2e Sinistre");
		viorelFLORICA.declarerSinistre(new Sinistre(1291, new Date(), dom, viorelFLORICA, police1329, 500));
		//Attribution du remboursement de l'assureur !
		viorelFLORICA.rembourserAssuré(viorelFLORICA.getSinistres().get(1).getCout());
				
		//affichage de l'assuré avec les données
		System.out.println(viorelFLORICA);
		viorelFLORICA.afficherSinistres();
		
		
		
	}

}
