package infoPO;

enum SEX{MAIL,FEMAIL};

public class DriveInfoPO {
	private int idCode;		//cityCode+officeCode+id 9 bits
	private String name;		
	private SEX sex;
	private String IDNumber;
	private String BirthDay;
	private String Tele;
	private String Period;		//2010/01/01-2030/01/01
	private String Institution; 
	
	public DriveInfoPO(int id,String n,SEX s,String IDNUM,String b,String tele,String p,String ins){
		this.idCode = id;
		this.name = n;
		this.sex = s;
		this.IDNumber = IDNUM;
		this.BirthDay = b;
		this.Tele = tele;
		this.Period = p;
		this.Institution = ins;
	}
	public String getInstitution(){
		return Institution;
	}
	
	public int getIDCode(){
		return idCode;
	}
	public String getName(){
		return name;
	}
	public String getBirthday(){
		return BirthDay;
	}
	public String getIDNumber(){
		return IDNumber;
	}
	public String getTele(){
		return Tele;
	}
	public SEX getSex(){
		return sex;
	}
	public String getperiod(){
		return Period;
	}
}
