package restaurantChain; 
import java.util.List;
public class Chain {	

		public void addRestaurant(String name, int tables) throws InvalidName {
			if(name==null || tables < 0 );
		}

		public Restaurant getRestaurant(String name) throws InvalidName{if(name==null);
			return null;
		}
		
		public List<Restaurant> sortByIncome(){
			return null;
		}
		
		public List<Restaurant> sortByRefused(){
			return null;
		}
		
		public List<Restaurant> sortByUnusedTables(){
			return null;
		}
}
