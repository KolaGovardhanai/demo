package com.zensar;

public class LoginDao {
	
	public Login getLogin(int password)
	{
		Login l = new Login(null, password);
		l.setUsername("sam");
		l.setPassword(1234);
		return l;
	}

}
