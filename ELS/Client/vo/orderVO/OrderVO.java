package orderVO;

import java.util.ArrayList;

enum GoodsType {
	SHIPPING,RAIL,TRANSPORT,FLXIBLE,ECONOMIC,STANDARD,EXPRESS,PAPERPAKAGE,
	WOODPACKAGE,EXPRESSPACKAGE,OTHERPACKAGE};

public class OrderVO {
	ArrayList<String>stateOfExpress;//¶©µ¥µÄÎïÁ÷×´Ì¬
	String id;
	int numOfGoods;
	double weight;
	double size;
	String nameOfGoods;
	double feeOfPack;
	double fee;
	GoodsType typeOfExpress;
	GoodsType typeOfPack;
	String nameOfSender;
	String addressOfSender;
	String phoneOfSender;
	String nameOfAddressee;
	String addressOfAddressee;
	String phoneOfAddressee;
	
	public OrderVO(ArrayList<String>stateOfExpress,String id,int numOfGoods,double weight,double size, 
			String nameOfGoods,double feeOfPack,double fee,GoodsType typeOfExpress,
			GoodsType typeOfPack,String nameOfSender,String addressOfSender,
			String phoneOfSender,String nameOfAddressee,String addressOfAddressee,
			String phoneOfAddressee){
		this.stateOfExpress=stateOfExpress;
		this.id=id;
		this.numOfGoods=numOfGoods;
		this.weight=weight;
		this.size=size;
		this.nameOfGoods=nameOfGoods;
		this.feeOfPack=feeOfPack;
		this.fee=fee;
		this.typeOfExpress=typeOfExpress;
		this.typeOfPack=typeOfPack;
		this.nameOfSender=nameOfSender;
		this.addressOfSender=addressOfSender;
		this.phoneOfSender=phoneOfSender;
		this.nameOfAddressee=nameOfAddressee;
		this.addressOfAddressee=addressOfAddressee;
		this.phoneOfAddressee=phoneOfAddressee;
	}
	public ArrayList<String> getStateOfExpress(){
		return stateOfExpress;
	}
	public String getID(){
		return id;
	}
	public int getNumOfGoods(){
		return  numOfGoods;
	}
	public double getWeight(){
		return weight;
	}
	public double getSize(){
		return size;
	}
	public String getNameOfGoods(){
		return nameOfGoods;
	}
	public double getFeeOfPack(){
		return feeOfPack;
	}
	public double getFee(){
		return fee;
	}
	public GoodsType getTypeOfExpress(){
		return typeOfExpress;
	}
	public GoodsType getTypeOfPack(){
		return typeOfPack;
	}
	public String getNameOfSender(){
		return nameOfSender;
	}
	public String getAddressOfSender(){
		return addressOfSender;
	}
	public String getPhoneOfSender(){
		return phoneOfSender;
	}
	public String getNameOfAddressee(){
		return nameOfAddressee;
	}
	public String getAddressOfAddressee(){
		return addressOfAddressee;
	}
	public String getPhoneOfAddressee(){
		return phoneOfAddressee;
	}

}


