package population;

public class PopulationDto {

	 private int dong;
	 private int ho;
	 private int menChild;
	 private int womenChild;
	 private int menTeen;
	 private int womenTeen;
	 private int menAdult;
	 private int womenAdult;
	 private int menMid;
	 private int womenMid;
	 private int menMidOld;
	 private int womenMidOld;
	 private int menOld;
	 private int womenOld;
	 private int menTotal;
	 private int womenTotal;
	 private int total;
	 private int average;
	 
	 
	public int getDong() {
		return dong;
	}
	
	public void setDong(int dong) {
		this.dong = dong;
	}
	public int getHo() {
		return ho;
	}
	public void setHo(int ho) {
		this.ho = ho;
	}
	public int getMenChild() {
		return menChild;
	}
	public void setMenChild(int menChild) {
		this.menChild = menChild;
	}
	public int getWomenChild() {
		return womenChild;
	}
	public void setWomenChild(int womenChild) {
		this.womenChild = womenChild;
	}
	public int getMenTeen() {
		return menTeen;
	}
	public void setMenTeen(int menTeen) {
		this.menTeen = menTeen;
	}
	public int getWomenTeen() {
		return womenTeen;
	}
	public void setWomenTeen(int womenTeen) {
		this.womenTeen = womenTeen;
	}
	public int getMenAdult() {
		return menAdult;
	}
	public void setMenAdult(int menAdult) {
		this.menAdult = menAdult;
	}
	public int getWomenAdult() {
		return womenAdult;
	}
	public void setWomenAdult(int womenAdult) {
		this.womenAdult = womenAdult;
	}
	public int getMenMid() {
		return menMid;
	}
	public void setMenMid(int menMid) {
		this.menMid = menMid;
	}
	public int getWomenMid() {
		return womenMid;
	}
	public void setWomenMid(int womenMid) {
		this.womenMid = womenMid;
	}
	public int getMenMidOld() {
		return menMidOld;
	}
	public void setMenMidOld(int menMidOld) {
		this.menMidOld = menMidOld;
	}
	public int getWomenMidOld() {
		return womenMidOld;
	}
	public void setWomenMidOld(int womenMidOld) {
		this.womenMidOld = womenMidOld;
	}
	public int getMenOld() {
		return menOld;
	}
	public void setMenOld(int menOld) {
		this.menOld = menOld;
	}
	public int getWomenOld() {
		return womenOld;
	}
	public void setWomenOld(int womenOld) {
		this.womenOld = womenOld;
	}
	public int getMenTotal() {
		return menTotal;
	}
	public void setMenTotal(int menTotal) {
		this.menTotal = menTotal;
	}
	public int getWomenTotal() {
		return womenTotal;
	}
	public void setWomenTotal(int womenTotal) {
		this.womenTotal = womenTotal;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	@Override
	public String toString(){
		return dong + "동" + ho + "호" + "는 " + total + "名 이 거주하고 있습니다."
				+ "\n0대 남자는 " + menChild + "名, 여자는 " + womenChild + "名"
				+ "\n10대 남자는 " + menTeen + "名, 여자는 " + womenTeen + "名"
				+ "\n20-30대 남자는 " + menAdult + "名, 여자는 " + womenAdult + "名"
				+ "\n40-50대 남자는 " + menMid + "名, 여자는 " + womenMid + "名"
				+ "\n60-70대 남자는 " + menMidOld + "名, 여자는 " + womenMidOld + "名"
				+ "\n80대이상 남자는 " + menOld + "名,  여자는 " + womenOld + "名"
				+ " 입니다.";
	}
	
}
