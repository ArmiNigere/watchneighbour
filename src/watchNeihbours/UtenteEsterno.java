package watchNeihbours;

import java.util.Random;
/*
 * this class is used for those user that are not registered to the watch neighbour app
 * they can access the sit and only view the map or alarms active in the area
 */
public class UtenteEsterno {
private int nextP;


public UtenteEsterno(){
	super();
	Random random= new Random();
	nextP= random.nextInt(1000);
   	
}
public void Stampa(){
	
System.out.println("User" + nextP);

}

public int getNextP() {
	return nextP;
}

}