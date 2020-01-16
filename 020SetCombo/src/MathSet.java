import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MathSet {

	public MathSet(String set1, String set2) {
		// TODO Auto-generated constructor stub
		ArrayList<Integer> intList = new ArrayList<>(intoInts(set1));
		ArrayList<Integer> intList2 = new ArrayList<>(intoInts(set2));
		Set<Integer> union = new TreeSet<Integer>(uCombine(intList,intList2));
		Set<Integer> dupes = new TreeSet<Integer>(FindDupes(intList,intList2));
		Set<Integer> diff1 = new TreeSet<Integer>(FindDiff(intList,dupes));
		Set<Integer> diff2 = new TreeSet<Integer>(FindDiff(intList2,dupes));
		Set<Integer> alldiff = new TreeSet<Integer>();
		alldiff.addAll(diff1);
		alldiff.addAll(diff2);
		
		System.out.println("Set One: "+intList);
		System.out.println("Set Two: "+intList2);
		System.out.println("\nUnion - "+union);
		System.out.println("Intersection - "+dupes);
		System.out.println("Difference A-B - "+diff1);
		System.out.println("Difference B-A - "+diff2);
		System.out.println("Symmetric Difference - "+alldiff+"\n\n");
	}
	
	public ArrayList<Integer> intoInts(String list) {
		ArrayList<Integer> intList = new ArrayList<>();
		String[] templist = list.split(" ");
		for(String pos : templist) {
			intList.add(Integer.parseInt(pos));
		}
		return intList;
		
	}
	public Set<Integer> uCombine(ArrayList<Integer> add1,ArrayList<Integer> add2){
		Set<Integer> set = new TreeSet<>();
		for (Integer pos: add1) {
			set.add(pos);
		}
		for(Integer pos: add2) {
			set.add(pos);
		}
		return set;
	}
	
	public Set<Integer> FindDupes(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		// TODO Auto-generated constructor stub
		Set<Integer> setToReturn = new TreeSet<>(); 
		for (Integer base : list1)
		  {
			for(Integer look:list2 ) {
				if (base==look)
				   {
				    setToReturn.add(base);
				   }
			}
		   
		  }
		return setToReturn;
	}
	public Set<Integer> FindDiff(ArrayList<Integer> list,Set<Integer> remove){
		Set<Integer> difference = new TreeSet<>();
			difference.addAll(list);
			for(Integer pos:remove) {
				difference.remove(pos);
			}
		return difference;
	}

}
