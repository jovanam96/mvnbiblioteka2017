package rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije;

import java.util.LinkedList;

import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Knjiga;


public class SODodajKnjigu {
	
	public static void izvrsi (Knjiga k, LinkedList<Knjiga> knjige) {
		if (k == null)
			throw new RuntimeException("Null knjiga");
		
		knjige.add(k);
	}

}
