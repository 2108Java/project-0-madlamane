package com.repo;

import com.models.Registration;

public interface DAO {
	public boolean insert(Registration registration);
	public boolean delete();
	public String iselect();
	public boolean update();
	

}
