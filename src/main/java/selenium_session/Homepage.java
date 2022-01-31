package selenium_session;

public class Homepage extends SearchWithID {
	
public void Search(String Companyname) {
		
		System.out.println("Search company with name");
		}

	public static void main(String[] args) {
		
		SearchWithID Id = new SearchWithID();
		Homepage Page= new Homepage();
		
		Id.Search("Wipro", 121);
		Page.Search("infosys");
		
				
			
		
	}

}
