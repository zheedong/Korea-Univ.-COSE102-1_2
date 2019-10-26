package exercise_1023;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSample S1, S2;

		S1 = new StaticSample();
		S1.n = 5;
		S1.g();
		StaticSample.m = 50;
		System.out.println(StaticSample.m);

		S2 = new StaticSample();
		S2.n = 8;
		S2.h();
		StaticSample.f(); //Static 키워드는 새 객체 선언 불필요
		System.out.println(StaticSample.m);
	}
}
