package rc.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka;

import java.util.LinkedList;

import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.interfejs.BibliotekaPretrazivanje;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOPronadjiKnjigu;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOUcitajKnjige;



public class BibliotekaPretrazivanjeImplementacija implements BibliotekaPretrazivanje {

	private LinkedList<Knjiga> knjige = 
			new LinkedList<Knjiga>();

	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(naslov, autor, isbn, izdavac, knjige);

	}

	public void ucitajKnjige(String filepath) throws Exception {
		knjige = SOUcitajKnjige.izvrsi(filepath);
		
	}

	
	

}
