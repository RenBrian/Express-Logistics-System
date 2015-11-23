package offerPO;

import java.util.ArrayList;

enum Package{PAPER,WOOD,PLASTIC,OTHER};

enum Type{STANDARD,ECONOMIC,EXPRESS};

public class OfferPO {

	private Package pack;
	private double shippingfee;
	private Type type;
	ArrayList<String> distance = new ArrayList<String>();
	
	public OfferPO(Package p,double s,Type t){
		this.pack = p;
		this.shippingfee = s;
		this.type = t;
	}
	public Package getPackage(){
		return pack;
	}
	public double getShippingfee(){
		return shippingfee;
	}
	public Type getType(){
		return type;
	}
	public void setDistance(String departure,String arrival,double dis){
		String item = null;
		int ID = 0;
		ID ++;
		item = ID + ":" + departure + ":" + arrival + ":" + dis;
		distance.add(item);
	}
	public String getDistance(int id){
		if (distance.contains(id)) {
			return distance.get(id);
		}
		return null;
	}

}
