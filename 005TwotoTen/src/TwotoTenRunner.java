import java.util.Scanner;

public class TwotoTenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String number;
		    
		System.out.println("Enter binary number"); 
		number = myObj.nextLine();  
		int num_send = Integer.parseInt(number);
		TwotoTen send = new TwotoTen(num_send);
	}

}
