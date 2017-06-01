package rc.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.interfejs.BibliotekaInterfejs;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SODodajKnjigu;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOObrisiKnjigu;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOPronadjiKnjigu;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOSacuvajKnjige;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije.SOUcitajKnjige;



public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = 
			new LinkedList<Knjiga>();

	public void dodajKnjigu(Knjiga k) {
		SODodajKnjigu.izvrsi(k, knjige);		
	}

	public void obrisiKnjigu(Knjiga k) {
		SOObrisiKnjigu.izvrsi(k, knjige);
		
	}

	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;

	}

	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(naslov, autor, isbn, izdavac, knjige);

	}

	public void ucitajKnjige(String filepath) throws Exception {
		knjige = SOUcitajKnjige.izvrsi(filepath);
		
	}

	public void sacuvajKnjige(String filepath) throws Exception {
		SOSacuvajKnjige.izvrsi(filepath, knjige);
		
	}

	


}

