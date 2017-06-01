package rc.ac.bg.fon.jgrass.mvnbiblioteka2017.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import rc.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Knjiga;

public class SOUcitajKnjige {
	
	public static LinkedList<Knjiga> izvrsi(String filepath) throws Exception {
		ObjectInputStream in =
			new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(filepath)));
		LinkedList<Knjiga> rezultat = (LinkedList<Knjiga>)(in.readObject());
		
		in.close();
		
		return rezultat; 
		
	}

}
