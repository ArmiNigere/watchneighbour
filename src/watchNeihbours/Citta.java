package watchNeihbours;

import java.util.Random;
/*  descrive cosa fa la classe
 * 
 */
public class Citta {
	
private String nomeCitta;
private double longitudine;
private double latitudine; 


 Random randomLocation = new Random();

// TO DO    citta ha suo raggio fisso  pero deve fisso per ogni citta con lo stesso nome, cambia solo quello
 // dei quartiere

public Citta(String nomeCitta) {
	super();
	this.nomeCitta = nomeCitta;
	this.longitudine = this.calcoloLong(); 
	this.latitudine = this.calcolaLat();
	
}
/*
 * These two  method calcoloLong() and calcoloLat()  calculate the longitudine and latitudine 
 * of a random point that is passed from the java Random class 
 */

public double calcoloLong(){
	double lung = randomLocation.nextDouble()* -180.0 + 90.0; 
	lung=lung*100;
	long l=Math.round(lung);
	return l=l/100;
}
public double calcolaLat(){
	double lat = randomLocation.nextDouble()* -360.0 + 180.0; 
	lat=lat*100;
	long l=Math.round(lat);
	return l=l/100;
	
}

@Override
public String toString() {
	return "citta [nomeCitta= " + nomeCitta + ", longitudine=" + longitudine+"°" + ", latitudine=" + latitudine+"°" + "]";
}

public String getNomeCitta() {
	return nomeCitta;
}

public void setNomeCitta(String nomeCitta) {
	this.nomeCitta = nomeCitta;
}

public double getLongitudine() {
	return longitudine;
}

public void setLongitudine(double longitudine) {
	this.longitudine = longitudine;
}

public double getLatitudine() {
	return latitudine;
}

public void setLatitudine(double latitudine) {
	this.latitudine = latitudine;
}
}
