package userPO;

import java.io.Serializable;

enum UserRole{CUSTOMER,COURIER,OFFICESTALL,TRANSITER,STOCKMANAGER,
	FINACIALSTALL,GENERALMANAGER,ADMINISTRATOR};

/**
 * User
 * @author thinkpad
 * @param int id
 * @param String name
 * @param String password
 * @param int role
 */
public class UserPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3220310991548111089L;
	private int id;
	private String name;
	private String password;
	private int role;
	
	public UserPO(int i, String n, String p, int r){
		this.id = i;
		this.name = n;
		this.password = p;
		this.role = r;
	}
	
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setID(int i){
		this.id = i;
	}
	public int getID(){
		return id;
	}
	
	public void setPassword(String p){
		this.password = p;
	}
	public String getPassword(){
		return password;
	}
	
	public void setRole(int r){
		this.role = r;
	}
	public int getRole(){
		return role;
	}
	
}
