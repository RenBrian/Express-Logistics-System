package accountPO;

import java.io.Serializable;

/**
 *bank account
 *@param int id
 *@param String name
 *@param double balance
 */
public class AccountPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private long id;		//19 bits at most
	private String name;	//Account Title
	private double balance;	//Account Balance
	
	public AccountPO (int i,String n,double b){
		this.id = i;
		this.name = n;
		this.balance = b;
	}
	
	public void setID(int i){
		this.id = i;
	}
	public long getID(){
		return id;
	}
	
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setBalance(double b){
		this.balance = b;
	}
	public double getBalance(){
		return balance;
	}
}
