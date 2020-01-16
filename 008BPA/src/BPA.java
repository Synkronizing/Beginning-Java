import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String word;
		String alpha="abcedefghijklmnopqrstuvwxyz";
		char[] alphaboi=alpha.toCharArray();
		System.out.println("How many movies are you rating?");
		word = myObj.nextLine();
		boolean t=false;
		int count=0;
		while(t==false) {
			for(int b=0;b<word.length();b++) {
				
				for(int c=0;c<alphaboi.length;c++)
				if(word.charAt(b)==alphaboi[c]) {
					count++;
				}
				if(count==0) {
					t=true;
				}
			}
			if(count >0) {
				count=0;
				System.out.println("How many movies are you rating?");
				word = myObj.nextLine();
			}
			
		}
		int amount = Integer.parseInt(word);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Random r = new Random();
		double criticav= Double.parseDouble(formatter.format(r.nextDouble()*100));
		word = "hello";
		ArrayList<Integer> web = new ArrayList<Integer>();
		ArrayList<Double> group = new ArrayList<Double>();
		double webav=0;
		double groupav=0;
		double totav;
		for(int a=1;a<=amount;a++) {
			System.out.println("Enter ratings from the movie review website for movie #"+a);
			while(word.length()!=0) {
				word = myObj.nextLine();
				if(word.length()!=0) {
					int temp=Integer.parseInt(word);
					web.add(temp);
				}
			}
			System.out.println("Please enter ratings from the focus group for movie #"+a);
			word="hello";
			while(word.length()!=0) {
				word = myObj.nextLine();
				if(word.length()!=0) {
					double temp=Double.parseDouble(word);
					group.add(temp);
				}
			}
			for(int d=0;d<web.size();d++) {
				webav=webav+web.get(d);
			}
			for(int e=0;e<group.size();e++) {
				groupav=groupav+ group.get(e);
			}
			webav=webav/web.size();
			groupav=groupav/group.size();
			totav=(webav*.2)+(groupav*.3)+(criticav*.5);
			
			System.out.println("Ratings for movie #"+ a);
			System.out.println("Average website rating: "+ formatter.format(webav));
			System.out.println("Average focus group rating: "+groupav);
			System.out.println("Average movie critic rating:" +criticav);
			System.out.println("Overall average rating: "+ formatter.format(totav));
				
		}
	}

}
