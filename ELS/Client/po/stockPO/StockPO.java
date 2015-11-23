
package stockPO; 
import infoPO.VehicleInfoPO;
import java.util.ArrayList;
import java.io.Serializable;

//库存入库单（快递编号、入库日期、目的地、区号、排号、架号、位号）
//库存出库单（快递编号、出库日期、目的地、装运形式（火车、飞机、汽车）、中转单编号或者汽运编号）
public class StockPO {
	
	//在入库时调用add方法增加库存数量，在出库时调用minus方法减少库存数量
	 int area;//区
	 int row;//排
	 int shelf;//架
	 int place;//位
	 float money;//金额
	 float expressNumber;//快递编号
	 String indate;//入库日期
	 String outdate;//出库日期
	 String destination;//目的地
	 String time;//时间
	 String  mean;//装运方式装运形式（火车、飞机、汽车）
	 long numth;//编号	
	 int inNum;//入库数量
	 int outNum;//出库数量
	 int storageNumber;//商品库存总数量
	 int shippingNumber;//航运区库存数量
	 int railNumber;//铁运区库存数量
	 int transportNumber;//汽运区库存数量
	 int flxibleNumber;//机动区库存数量
	 double alarmScale;//警戒比例
	 int shippingStart;//航运区起始
	 int shippingEnd;//航运区终止
	 int railStart;//铁运区终止
	 int railEnd;//铁运区终止
	 int transportStart;//汽运区起始
	 int transportEnd;//汽运区终止
	 int flxibleStart;//机动区起始
	 int flxibleEnd;//机动区终止

	 
	 public StockPO (int area,int row, int shelf, int place,float money, float expressNumber,
	 String indate, String outdate,String destination, String time,String  mean,
	 long numth,int inNum, int outNum, int storageNumber,int shippingNumber, int railNumber, int transportNumber,
			int flxibleNumber, double alarmScale, int shippingStart,int shippingEnd, int railStart, int railEnd,
			int transportStart,int transportEnd, int flxibleStart, int flxibleEnd) {
		super();
		this.area =area ;
		this.row =row ;
		this.shelf=shelf ;
		this.place=place ;
		this.money =money ;
		this.expressNumber = expressNumber;
		this.indate = indate;
		this.outdate=  outdate;
		this.destination =destination  ;
		this.time =time ;
		this.mean= mean;
		this.numth = numth;
		this.inNum = inNum;
		this.outNum = outNum;
		this.storageNumber = storageNumber;
		this.shippingNumber = shippingNumber;
		this.railNumber = railNumber;
		this.transportNumber = transportNumber;
		this.flxibleNumber = flxibleNumber;
		this.alarmScale = alarmScale;
		this.shippingStart = shippingStart;
		this.shippingEnd = shippingEnd;
		this.railStart = railStart;
		this.railEnd = railEnd;
		this.transportStart = transportStart;
		this.transportEnd = transportEnd;
		this.flxibleStart = flxibleStart;
		this.flxibleEnd = flxibleEnd;
	}

	public void addInNum(){
		inNum++;
	}
	
	public void minusInNum(){
		inNum--;
	}

	public int getInNum() {
		return inNum;
	}
	
	public void addOutNum(){
		outNum++;
	}
	
	public void minusOutNum(){
		outNum--;
	}

	public int getOutNum() {
		return outNum;
	}

	public double getAlarmScale() {
		return alarmScale;
	}

	public void setAlarmScale(double alarmScale) {
		this.alarmScale = alarmScale;
	}

	public int getShippingStart() {
		return shippingStart;
	}

	public void setShippingStart(int shippingStart) {
		this.shippingStart = shippingStart;
	}

	public int getShippingEnd() {
		return shippingEnd;
	}

	public void setShippingEnd(int shippingEnd) {
		this.shippingEnd = shippingEnd;
	}

	public int getRailStart() {
		return railStart;
	}

	public void setRailStart(int railStart) {
		this.railStart = railStart;
	}

	public int getRailEnd() {
		return railEnd;
	}

	public void setRailEnd(int railEnd) {
		this.railEnd = railEnd;
	}

	public int getTransportStart() {
		return transportStart;
	}

	public void setTransportStart(int transportStart) {
		this.transportStart = transportStart;
	}

	public int getTransportEnd() {
		return transportEnd;
	}

	public void setTransportEnd(int transportEnd) {
		this.transportEnd = transportEnd;
	}

	public int getFlxibleStart() {
		return flxibleStart;
	}

	public void setFlxibleStart(int flxibleStart) {
		this.flxibleStart = flxibleStart;
	}

	public int getFlxibleEnd() {
		return flxibleEnd;
	}

	public void setFlxibleEnd(int flxibleEnd) {
		this.flxibleEnd = flxibleEnd;
	}
	
	public void addStorageNUm(){
		storageNumber++;
	}
	
	public void minusStorageNUm(){
		storageNumber--;
	}
	
	public int getStorageNumber() {
		return storageNumber;
	}

	public void addShippingNUm(){
		shippingNumber++;
	}
	
	public void minusShippingNUm(){
		storageNumber--;
	}
	
	public int getShippingNumber() {
		return shippingNumber;
	}

	public void addRailNUm(){
		railNumber++;
	}
	
	public void minusRailNUm(){
		storageNumber--;
	}
	
	public int getRailNumber() {
		return railNumber;
	}

	public void addTransportNUm(){
		transportNumber++;
	}
	
	public void minusTransportNUm(){
		storageNumber--;
	}
	
	public int getTransportNumber() {
		return transportNumber;
	}

	public void addFlxibleNUm(){
		flxibleNumber++;
	}
	
	public void minusFlxibleNUm(){
		storageNumber--;
	}

	public int getFlxibleNumber() {
		return flxibleNumber;
	}
	public  int  getarea() {
		return area;
	}
	
	public  int getrow () {
		return row;
	}
	
	public  int getshelf () {
		return shelf;
	}
	
	public  int getplace() {
		return  place;
	}
	
	public float getmoney () {
		return  money;
	}
	
	public float getexpressNumber () {
		return  expressNumber;
	}
	 
	public String getOutdate() {
		return outdate;
	}
	
	
	public String getIndate() {
		return indate;
	}
	
	public String getdestination() {
		return destination;
	}
	
	public String gettime() {
		return time;
	}
	
	public long getnumth() {
		return numth;
	}	
}
