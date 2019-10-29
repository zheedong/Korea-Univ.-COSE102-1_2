package assignment_1023;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String NAME_IN;
		int SALARY_IN;
		Employees[] Arr_Employees = new Employees[Employees.MAX_Employee];

		int index = 0;
		while (Employees.getCount() < Employees.MAX_Employee) {
			System.out.print("이름>>> ");
			NAME_IN = scan.next();
			if (NAME_IN.equals("exit"))
				break;
			System.out.print("연봉>>> ");
			SALARY_IN = scan.nextInt();

			Arr_Employees[index] = new Employees(NAME_IN, SALARY_IN);
			System.out.println("현재 직원 수 = " + Employees.getCount());
			System.out.println();
			index++;
		}
	}

}
