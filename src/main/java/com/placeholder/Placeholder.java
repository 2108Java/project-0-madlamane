package com.placeholder;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.presentation.MainMenu;
import com.repo.DAOBankImp;
import com.repo.DAOImp;
import com.repo.DAOLoginImp;

public class Placeholder {
	
	public final static Logger loggy = Logger.getLogger(Placeholder.class);
	
	public static void main(String[] args) {
		
       loggy.setLevel(Level.WARN);
		
		loggy.info("Starting the application");
		
		MainMenu m= new MainMenu();
		//m.display();
		m.bankShow();
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
		//DAOLoginImp y= new DAOLoginImp();
		//y.iselect();
		////y.insert();
		
		
		
	}

}
