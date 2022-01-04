package otomasyon;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String name;
	private String e_mail;
	private String password;
	
	public User(int id, String name, String e_mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.e_mail = e_mail;
		this.password = password;
		}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int addUser(int id, String name, String e_mail, String password) 
	{	int result  = 0;
		return result;
	}
	
	public int updateUser() 
	{
		int result  = 0;
		return result;
	}
	
	public int deleteUser() 
	{
		int result  = 0;
		return result;
	}
	
	public List<User> selectUser()
	{
		User ahmet =  new User(1,"a","a","a");
		List<User> news = new ArrayList<User>();
		return news;
	}
	

}
