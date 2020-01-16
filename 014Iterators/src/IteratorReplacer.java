//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		String[] words = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove=rem;
		replaceWith=rep;
		ListIterator<String> itera= list.listIterator();
		while(itera.hasNext()) {
			String thing=itera.next();
			if(thing.equals(toRemove)) {
				itera.set(replaceWith);
			}
			
		}
		System.out.println(list.toString());
	}


	
}