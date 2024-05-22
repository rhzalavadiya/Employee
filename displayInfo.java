package employeeData;

import java.util.Scanner;

public class displayInfo {

	public static void main(String[] args) {
		employeePersonalInfo emp = new employeePersonalInfo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter your Contact No: ");
		int contact = sc.nextInt();
		System.out.print("Enter your email: ");
		String email = sc.next();
		
		emp.setName(name);
		emp.setMobileNo(contact);
		emp.setEmail(email);
		
		System.out.println(emp);

	}

}
