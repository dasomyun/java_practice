package ch05.quiz02; 

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스2- 실습문제 25) 생성자
 */

class Song{
	private String str;
	
	public Song(String str){
		this.str=str;
	}
	
	public String getTitle(){
		return str;
	}
}

public class Quiz25 {
	public static void main(String[] args) {
		Song mySong=new Song("Let it go");
		Song yourSong=new Song("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + yourSong.getTitle());
	}
}
