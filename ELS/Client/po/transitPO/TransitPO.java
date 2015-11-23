package transitPO;

public class TransitPO {
	//记录装运日期、本中转中心货运编号、出发地、到达地、监装员、本次装箱所有托运单号、运费，车次号，车厢号huo
	//记录装运日期、本中转中心汽运编号、出发地、到达地、监装员。本次装箱所有托运单号、运费、车次号、押运员qi
	//记录装运日期、本中转中心航运编号、出发地、到达地、监装员、本次装箱所有托运单号、运费，航班号，货柜号feiji
	String  mean;//装运方式
	String date;//记录装车日期
	String locationStarting;//出发地
	String locationArriving;//到达地
	String supervisor;//监装员
	String supercargo;//押运员
	String flightNumber;//航班号
	String trainNumber;//车次号
	String coachNumber;//车厢号
	String containerNumber;//货柜号
	long numth;//编号
	float fare;// 运费
	long checknumber; //本次装箱所有托运单号
	public TransitPO(String mean,String date,String locationStarting,String locationArriving,
			String Supervisor,String supercargo,long numth,float fare,long checknumber,String flightNumber,
			String trainNumber,String coachNumber,String ContainerNumber) {
		super();
		this.mean = mean;
		this.date = date;
		this.locationStarting=locationStarting;
		this.locationArriving=locationArriving ;
		this.supervisor=supervisor;
		this.supercargo = supercargo;
		this.numth = numth;
		this.fare=fare ;
		this.checknumber = checknumber ;
		this.flightNumber=flightNumber;//航班号
		this.trainNumber=trainNumber;//车次号
		this.coachNumber=coachNumber;//车厢号
		this.containerNumber=containerNumber;//货柜号
	}

	
	public String getMean() {
		return mean;
	}
	
	public String getDate () {
		return date ;
	}
	
	public String getLocationStarting() {
		return locationStarting;
	}
	
	public String getLocationArriving() {
		return locationArriving;
	}
	
	public String getSupervisor () {
		return supervisor;
	}
	
	public long getNumth () {
		return numth;
	}
	
	public float getFare () {
		return fare;
	}
	
	public long getChecknumber() {
		return checknumber;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public String getTrainNumber() {
		return trainNumber;
	}
	
	public String getCoachNumber() {
		return coachNumber;
	}
	public String getContainerNumber() {
		return containerNumber ;
	}

}