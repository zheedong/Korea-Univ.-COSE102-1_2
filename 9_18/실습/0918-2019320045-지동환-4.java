package Exercise;

public class Exercise_4 {
	public static void main(String[] args) {
		final double KM_PER_MILE = 1.609344;
		double km;
		double mile = 60.0;
		//KM_PER_MILE = 1.5;

		km = KM_PER_MILE * mile;

		System.out.println("60마일 = " + km + "킬로미터");
	}
}
