package stockVO;

public class StockVO {
	//ÔÚÈë¿âÊ±µ÷ÓÃadd·½·¨Ôö¼Ó¿â´æÊýÁ¿£¬ÔÚ³ö¿âÊ±µ÷ÓÃminus·½·¨¼õÉÙ¿â´æÊýÁ¿
		 int area;//Çø
		 int row;//ÅÅ
		 int shelf;//¼Ü
		 int place;//Î»
		 float money;//½ð¶î
		 float expressNumber;//¿ìµÝ±àºÅ
		 String £É£îdate;//Èë¿âÈÕÆÚ
		 String £Ï£õ£ôdate;//³ö¿âÈÕÆÚ
		 String destination;//Ä¿µÄµØ
		 String time;//Ê±¼ä
		 String  mean;//×°ÔË·½Ê½×°ÔËÐÎÊ½£¨»ð³µ¡¢·É»ú¡¢Æû³µ£©
		 long numth;//±àºÅ	
		 int inNum;//Èë¿âÊýÁ¿
		 int outNum;//³ö¿âÊýÁ¿
		 int storageNumber;//ÉÌÆ·¿â´æ×ÜÊýÁ¿
		 int shippingNumber;//º½ÔËÇø¿â´æÊýÁ¿
		 int railNumber;//ÌúÔËÇø¿â´æÊýÁ¿
		 int transportNumber;//ÆûÔËÇø¿â´æÊýÁ¿
		 int flxibleNumber;//»ú¶¯Çø¿â´æÊýÁ¿
		 double alarmScale;//¾¯½ä±ÈÀý
		 int shippingStart;//º½ÔËÇøÆðÊ¼
		 int shippingEnd;//º½ÔËÇøÖÕÖ¹
		 int railStart;//ÌúÔËÇøÖÕÖ¹
		 int railEnd;//ÌúÔËÇøÖÕÖ¹
		 int transportStart;//ÆûÔËÇøÆðÊ¼
		 int transportEnd;//ÆûÔËÇøÖÕÖ¹
		 int flxibleStart;//»ú¶¯ÇøÆðÊ¼
		 int flxibleEnd;//»ú¶¯ÇøÖÕÖ¹

		 
		 public StockVO (int area,int row, int shelf, int place,float money, float expressNumber,
		 String £É£îdate, String £Ï£õ£ôdate,String destination, String time,String  mean,
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
			this.£É£îdate = £É£îdate;
			this.£Ï£õ£ôdate=  £Ï£õ£ôdate;
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
		 
		public String get£Ï£õ£ôdate() {
			return £Ï£õ£ôdate;
		}
		
		
		public String get£É£îdate() {
			return £É£îdate;
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
