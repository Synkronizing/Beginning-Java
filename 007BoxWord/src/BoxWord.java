import java.util.Arrays;

public class BoxWord {

	public BoxWord(String word) {
		// TODO Auto-generated constructor stub
		char[] vertical = word.toCharArray();
		System.out.println(word);
		
		
		int word_length = word.length();
		int inbetween =word.length()-2;
		vertical = Arrays.copyOfRange(vertical, 1, word_length-1);
		int b=0;
		for(int a=word.length()-3;a>=0;a--) {
			System.out.print(vertical[b]);
			for(int c=0;c<inbetween;c++) {
			System.out.print(" ");
			}
			System.out.println(vertical[a]);
			b++;
		}
		char[] reverse = word.toCharArray();
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(reverse[i]);
		}
	}

}
