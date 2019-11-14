package exercise_1113;

public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름 = " + obj.getName());
		System.out.println("통장 잔고 = " + obj.getBalance());
	}
}