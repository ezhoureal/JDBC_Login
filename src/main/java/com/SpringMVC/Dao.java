package com.SpringMVC;

public interface Dao {
	public boolean check(String name, String password);
	public void addUser(String name, String password);
	public boolean unit(String name);
}
