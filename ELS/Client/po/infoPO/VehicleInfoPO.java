package infoPO;

public class VehicleInfoPO {
	private int idCode;		//cityCode+officeCode+id  9 bits
	private String LicenseNum;	//LicenseNumber
	private String Engine;		//engine number
	private String Underpan;	//underpan number
	private String DateOfPurchase;
	private String DataOfService;//Date:2015/01/01
	
	public VehicleInfoPO(int id,String L,String E,String U,String DP,String DS){
		this.idCode = id;
		this.LicenseNum = L;
		this.Engine = E;
		this.Underpan = U;
		this.DateOfPurchase = DP;
		this.DataOfService = DS;
	}
	public int getIDCode(){
		return idCode;
	}
	public String getLicense(){
		return LicenseNum;
	}
	public String getDateOfService(){
		return DataOfService;
	}
	public String getEngine(){
		return Engine;
	}
	public String getUnderpan(){
		return Underpan;
	}
	public String getDateOfPurchase(){
		return DateOfPurchase;
	}
	
}
