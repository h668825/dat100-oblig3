package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private int nesteLedig = 0;
	Innlegg[] innleggtabell;
	
	public Blogg() {
		innleggtabell = new Innlegg[20]; 
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde]; 
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return innleggtabell[i].getId();
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if (nesteLedig < innleggtabell.length - 1) {
			return true;
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		}
		innleggtabell[nesteLedig] = innlegg;
		nesteLedig++;
		return true;
	}
	
	public String toString() {
		String streng = nesteLedig + "\n";
		for (int i = 0; i < nesteLedig; i++) {
			streng.concat(innleggtabell[i].toString());
		}
		return streng;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}