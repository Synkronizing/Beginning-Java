import java.lang.reflect.Array;

public class TriangleFive {

	public TriangleFive(int num_send, String letter) {
		// TODO Auto-generated constructor stub
		String alphasimple = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int position = alphasimple.indexOf(letter);
		int num_temp=num_send;
		int line_number=0;
		for(int a=num_send;a!=0;a--) {
			
			num_temp=num_send;
			line_number++;
			for(int b=0;b<num_send;b++) {
				
				int new_position=position+b;
				if(new_position>25) {
					new_position=new_position-26;
				}
				for(int c=0;c<num_temp;c++) {
					if(line_number<=num_temp) {
						System.out.print(Array.getChar(alpha, new_position));
					}
				}
				num_temp=num_temp-1;
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
