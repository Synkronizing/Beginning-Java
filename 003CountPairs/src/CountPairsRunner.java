import java.util.Scanner;

public class CountPairsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String word;
		    
		System.out.println("Enter String"); 
		word = myObj.nextLine(); 
		CountPairs send = new CountPairs(word);
	}

}
