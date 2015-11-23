package agencyPO;

import java.io.Serializable;

enum Role{COURIER,OFFiCE,TRANSIT,FINANCE,MANAGER,ADMIN};
public class AgencyStaffPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2964152971546589279L;
	
	int id;				//identity
	String name;		//name
	int qualification;	//working years
	Role role;			//occupation
	String institution;	//institution
	public AgencyStaffPO(int id,String n,int q,Role r,String ins){
		this.id = id;
		this.name = n;
		this.qualification = q;
		this.role = r;
		this.institution = ins;
	}
	
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getQualification(){
		return qualification;
	}
	public Role getRole(){
		return role;
	}
	public String getInstitution(){
		return institution;
	}
	
}
