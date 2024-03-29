import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {

	public OddEvenSets(String letters) {
		// TODO Auto-generated constructor stub
		String[] base = letters.split(" ");
		Set<String> tempset = new TreeSet<String>(Arrays.asList(base));
		Set<Integer> set = new TreeSet<Integer>();
		for(String number : tempset) {
			   set.add(Integer.parseInt(number)); 
			}
		Set<Integer> odds = new TreeSet<Integer>();
		Set<Integer> evens = new TreeSet<Integer>();
		
		for(Integer position: set) {
			if(position%2==0) {
				evens.add(position);
			}
			else {
				odds.add(position);
			}
		}
		System.out.println("Odds: "+ odds);
		System.out.println("Evens: "+evens);
	}
	

}
