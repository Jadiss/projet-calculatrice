package com.calculatrice.me;

public final class Operation_division {
	
	public static  float getResteFrom(float dividende ,float diviseur) {
		return dividende%diviseur;	
	}
	
	public static long getQuotientFrom(float dividende, float diviseur) {
		//Math.floor(a)
		return Math.round(dividende/diviseur);
	}

}
