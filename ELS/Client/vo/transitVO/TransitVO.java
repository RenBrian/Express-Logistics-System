package transitVO;

public class TransitVO {
	String time;
	String numOfTrucks;
	String start;//³ö·¢µØ
	String arrival;//µ½´ïµØ
	String monitor;//¼à×°Ô±
	String  escort;//ÑºÔËÔ±
	double fee;
	String id;
	
	public TransitVO(String time,String numOfTrucks,String start,String arrival,
			String monitor,String  escort,double fee,String id){
		this.time=time;
		this.numOfTrucks=numOfTrucks;
		this.start=start;
		this.arrival=arrival;
		this.monitor=monitor;
		this.escort=escort;
		this.fee=fee;
		this.id=id;
		
	}
	public String getTime(){
		return time;
	}
	public String getNumOfTrucks(){
		return numOfTrucks;
	}
	public String getStart(){
		return start;
	}
	public String getArrival(){
		return arrival;
	}
	public String getMonitor(){
		return monitor;
	}
	public String getEscort(){
		return escort;
	}
	public double getFee(){
		return fee;
	}
	public String getID(){
		return id;
	}

}
