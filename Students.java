package week3.day1;

public class Students {
	
	public static void getStudentInfo(int id) {
		
		System.out.println(id);
	}
	public static void getStudentInfo(int id,String name) {
		
		System.out.println(id+","+name);
	}
	public static void getStudentInfo(String email,long ph) {
		
		System.out.println(email+","+ph);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students.getStudentInfo(606);
		Students.getStudentInfo(606,"viji");
		Students.getStudentInfo("vijilakshmi457@gmail.com",908654);

	}

}
