import java.util.Scanner;

public class TriangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String num1;
		String num2;
		String num3;
		System.out.println("Enter Side A:");   
		num1 = myObj.nextLine();
		System.out.println("Enter Side B:"); 
		num2 = myObj.nextLine();  
		System.out.println("Enter Side C:"); 
		num3 = myObj.nextLine();  
		int numA = Integer.parseInt(num1);
		int numB = Integer.parseInt(num2);
		int numC = Integer.parseInt(num3);
		Triangle send = new Triangle(numA,numB,numC);
	}

}
