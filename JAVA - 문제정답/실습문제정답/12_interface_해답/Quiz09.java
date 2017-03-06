package ch07.quiz;

interface DataAcessObject{
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAcessObject{

	@Override
	public void select() {
		System.out.println("OracleDao 검색");
	}

	@Override
	public void insert() {
		System.out.println("OracleDao 삽입");
	}

	@Override
	public void update() {
		System.out.println("OracleDao 수정");
	}

	@Override
	public void delete() {
		System.out.println("OracleDao 삭제");
	}	
}

class MySql implements DataAcessObject{

	@Override
	public void select() {
		System.out.println("MySqlDao 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqlDao 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySqlDao 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySqlDao 삭제");
	}
}

public class Quiz09 {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySql());
	}
	
	public static void dbWork(DataAcessObject dao){
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		System.out.println();
	}
}
