package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		File fil = new File(mappe + filnavn);
		PrintWriter skriver;
		try {
			skriver = new PrintWriter(fil);
		} catch (FileNotFoundException e){
			System.out.println("Filsti er ikke gyldig.");
			return false;
		}
		skriver.println(samling.toString());
		skriver.close();	
		System.out.println("Filsti ikke gyldig.");
		return true;
	}
}
