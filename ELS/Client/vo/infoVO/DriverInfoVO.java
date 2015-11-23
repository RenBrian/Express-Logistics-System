package infoVO;

public class DriverInfoVO {
	String number;
	String name;
	String dateOfBirth;
	String identity;
	String phone;
	String sex;//ÐÔ±ð
	String termOfDriving;//¼ÝÊ»Ö¤ÆÚÏÞ
	
	public DriverInfoVO(String number,String name,String dateOfBirth,
			String identity,String phone,String sex,String termOfDriving){
		this.number=number;
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.identity=identity;
		this.phone=phone;
		this.sex=sex;
		this.termOfDriving=termOfDriving;
	}
	public String getNumber(){
		return number;
	}
	public String getName(){
		return name;
	}
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public String getIdentity(){
		return identity;
	}
	public String getPhone(){
		return phone;
	}
	public String getSex(){
		return sex;
	}
	public String getTermOfDriving(){
		return termOfDriving;
	}

}
