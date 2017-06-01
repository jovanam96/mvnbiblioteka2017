package rc.ac.bg.fon.jgrass.mvnbiblioteka2017.interfejs;

import java.util.LinkedList;

import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Autor;
import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Knjiga;


public interface BibliotekaPretrazivanje {

	public LinkedList<Knjiga> pronadjiKnjigu(
			String naslov, Autor autor, long isbn, String izdavac);
	
	public void ucitajKnjige(String filepath) throws Exception;
	
	
}
