package watchNeihbours;

import java.util.ArrayList;
import java.util.List;

public class ListUtente {

	// This is a data structure that contains all the users that get registrated
		List<Utente> items;
		
		public ListUtente(){
			this.items=new ArrayList<Utente>();
		}
		
		public void addItem(Utente item){
			this.items.add(item);
		}
		
		public void removeItem(Utente item){
			this.items.remove(item);
		}
		
		 public boolean contains(Utente item)
		 {
			 return this.items.contains(item);
		 }

	}

