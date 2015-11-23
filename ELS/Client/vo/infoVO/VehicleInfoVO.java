package infoVO;

public class VehicleInfoVO {
	private String code;//³µÁ¾´úºÅ
	private String numberOfEngine;//·¢¶¯»úºÅ
	private String plateNumber;//³µÅÆºÅ
	private String chassisNumber;//µ×ÅÌºÅ
	private String dateOfService;//·þÒÛÊ±¼ä
	
	public VehicleInfoVO(String code,String numberOfEngine,String plateNumber,
			String chassisNumber,String dateOfService){
		this.code=code;
		this.numberOfEngine=numberOfEngine;
		this.plateNumber=plateNumber;
		this.chassisNumber=chassisNumber;
		this.dateOfService=dateOfService;
	}
	public String getCode(){
		return code;
	}
	public String getNumberOfEngine(){
		return numberOfEngine;
	}
	public String getPlateNumber(){
		return plateNumber;
	}
	public String getChassisNumber(){
		return chassisNumber;
	}
	public String getDateOfService(){
		return dateOfService;
	}

}
