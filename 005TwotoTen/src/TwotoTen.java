
public class TwotoTen {

	public TwotoTen(int num_send) {
		// TODO Auto-generated constructor stub
		int remainder;
		int basetwo=0;
		int a = 1;
		while(num_send!=0) {
			remainder= num_send % 10;
			basetwo = basetwo + remainder * a;//add value of one in binary to base 2
			a=a*2; //power of two
			num_send= num_send/10; //Next spot
		}
		System.out.print(basetwo);
	}

}
