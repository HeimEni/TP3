package fr.eni.quelmedecin.test;

import java.time.LocalDate;

import fr.eni.quelmedecin.bo.MedecinGeneraliste;
import fr.eni.quelmedecin.bo.Patient;
import fr.eni.quelmedecin.ctrl.Methode;

public class TestClasses {

	public static void main(String[] args) {
		Methode ctrl = Methode.getMethode();
		System.out.println("___________________________ Test téléphone Patients ________________________");
		Patient mac = new Patient("Vambuce", "mac'douglas", "0123456789", 'F', 287060244010154l,
				LocalDate.of(1987, 6, 2), "Allergie aux arachides");
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		mac.setPrenom(ctrl.premiereEnMajuscule(mac.getPrenom()));
		//formattage numero de telephone
		mac.setNumTel(ctrl.formatNumeroTelephone(mac.getNumTel()));
		mac.afficher();System.out.println();

		
		Patient ines = new Patient("Perret", "inès", "0698745123", 'F', 245021067034521l, LocalDate.of(1945, 2, 10),
				null);
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		ines.setPrenom(ctrl.premiereEnMajuscule(ines.getPrenom()));
		//formattage numero de telephone
		ines.setNumTel(ctrl.formatNumeroTelephone(ines.getNumTel()));
		ines.afficher();System.out.println();

		
		Patient sidney = new Patient("Pamamobe", "sidney-scott", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null);
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		sidney.setPrenom(ctrl.premiereEnMajuscule(sidney.getPrenom()));
		//formattage numero de telephone
		sidney.setNumTel(ctrl.formatNumeroTelephone(sidney.getNumTel()));
		sidney.afficher();System.out.println();

		
		Patient jessie = new Patient("Watson", "jessie james", "01254266788", 'M', 287060244010154l,
				LocalDate.of(1975, 8, 17), "Allergie au lactose");
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		jessie.setPrenom(ctrl.premiereEnMajuscule(jessie.getPrenom()));
		//formattage numero de telephone
		jessie.setNumTel(ctrl.formatNumeroTelephone(jessie.getNumTel()));
		jessie.afficher();System.out.println();
		
		System.out.println("___________________________ Test téléphone Médecins ________________________");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28");
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		melanie.setPrenom(ctrl.premiereEnMajuscule(melanie.getPrenom()));
		//formattage numero de telephone
		melanie.setNumTel(ctrl.formatNumeroTelephone(melanie.getNumTel()));
		melanie.afficher();System.out.println();

		
		MedecinGeneraliste edmond = new MedecinGeneraliste("Bosapin", "Edmond", "21.71.81.92.06");
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		edmond.setPrenom(ctrl.premiereEnMajuscule(edmond.getPrenom()));
		//formattage numero de telephone
		edmond.setNumTel(ctrl.formatNumeroTelephone(edmond.getNumTel()));
		edmond.afficher();System.out.println();

		
		MedecinGeneraliste vikie = new MedecinGeneraliste("Madge", "vickie", "OO04050607");
		//mettre la 1ere lettre de chaque mot du prénom en majuscule
		vikie.setPrenom(ctrl.premiereEnMajuscule(vikie.getPrenom()));
		//formattage numero de telephone
		vikie.setNumTel(ctrl.formatNumeroTelephone(vikie.getNumTel()));
		vikie.afficher();
		
	}
}
