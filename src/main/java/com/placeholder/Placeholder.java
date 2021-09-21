package com.placeholder;

import com.presentation.MainMenu;
import com.repo.DAOBankImp;
import com.repo.DAOImp;
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
		//a.insert();
		
		//a.transaction();
				//DAOLoginImp b= new DAOLoginImp();
				
				
				//b.insert();
				//a.select();
		
		//DAOBankImp x= new DAOBankImp();
		//x.customerBalance();
		//x.openAccount();
		//x.decision();
		//x.displayAccount();
		//x.deposit();
		DAOLoginImp y= new DAOLoginImp();
		y.iselect();
		//y.insert();
		
		
		
	}

}
