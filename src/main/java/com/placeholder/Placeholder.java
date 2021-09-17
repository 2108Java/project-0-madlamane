package com.placeholder;

import com.repo.DAOLoginImp;

public class Placeholder {
	
	
	/*public static void prettyDisplay(Registration[] re) {
		for(int i=0; i<re.length; i++) {
			if(re[i] != null) {
				
				System.out.println(re[i].getFirstname());
				System.out.println(re[i].getLastname());
				System.out.println(re[i].getAccounttype());
				System.out.println(re[i].getUsername());
				System.out.println(re[i].getPassword());
				
			}
		}
		
	}*/
	public static void main(String[] args) {
		
		//MainMenu m= new MainMenu();
		//m.display();
		//prettyDisplay(re);
		//DAOImp a= new DAOImp();
				DAOLoginImp b= new DAOLoginImp();
				
				//a.insert();
				b.insert();
		
		
		
	}

}
