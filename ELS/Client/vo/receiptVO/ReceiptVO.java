package receiptVO;

public class ReceiptVO {
	String nameOfCourier;
	String time;
	double fee;
	String id;
	
	public ReceiptVO(String nameOfCourier,String time,double fee,String id){
		this.nameOfCourier=nameOfCourier;
		this.time=time;
		this.fee=fee;
		this.id=id;		
	}
	
	public String getNameOfCourier(){
		return nameOfCourier;
	}
	public String getTime(){
		return time;
	}
	public double getFee(){
		return fee;
	}
	public String getID(){
		return id;
	}

}
