package t19_Databases.Connection;

public class Test2Run {
	public static void main(String[] args) {
		Test2DAO dao=new Test2DAO();

		Test2Service service =new Test2Service();

		service.getDBProcesssMethod();

		dao.dbClose();

		System.out.println("작업끝.....");
	}
}
