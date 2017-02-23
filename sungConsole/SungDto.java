package sungConsole;
 // db¶û °ü·Ã 
public class SungDto {

	private int num; 
	private String name; 
	private int kor;
	private int eng;
	private int mat;
	private int society;
	private int history;
	private int music;
	private int art;
	private int physical;
	private int total;
	private float average;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSociety() {
		return society;
	}
	public void setSociety(int society) {
		this.society = society;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getArt() {
		return art;
	}
	public void setArt(int art) {
		this.art = art;
	}
	public int getPhysical() {
		return physical;
	}
	public void setPhysical(int physical) {
		this.physical = physical;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "SungDto [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", society=" + society + ", history=" + history + ", music=" + music + ", art=" + art + ", physical="
				+ physical + ", total=" + total + ", average=" + average + "]";
	}
	
}
