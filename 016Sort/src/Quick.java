import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quick {
	public static void main(String[] args) throws IOException {
		Scanner myObj = new Scanner(System.in);
		ArrayList<String>  list = new ArrayList<String>();
		String year;
		    
		System.out.println("Enter a year between 1880-2018"); 
		year = myObj.nextLine();
		
		File file = new File("/home/compsci/Documents/names/yob"+year+".txt"); 
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] words = line.split(",");
			String given = words[0];	
			list.add(given);
		}
		Quick ob = new Quick(); 
		int n = list.size();
        ob.sort(list, 0, n-1); 
		
		FileWriter writer = new FileWriter("quick.txt"); 
		for(String str: list) {
		  writer.write(str + System.lineSeparator());
		}
		
	
	}
	private void sort(ArrayList<String> list, int low, int high) {
		if (low < high) 
        { 
            
            int pi = partition(list, low, high); 
            
            // Recursively sort elements before 
            // partition and after partition
            sort(list, low, pi-1); 
            sort(list, pi+1, high); 
        } 
		
		
	}
	private int partition(ArrayList<String> list, int low, int high) {
		String pivot = list.get(high);  
        int i = (low-1); // small index
        for (int j=low; j<high; j++) 
        { 
            // If current name is smaller than pivot
            if (list.get(j).compareTo(pivot) < 0) 
            { 
                i++; 
  
                //swamp current name with small index
                String temp = list.get(i); 
                list.set(i, list.get(j));
                list.set(j, temp);
                
            } 
        } 
        
        //Swamp name to right of lowest with highest(pivot)
        String temp = list.get(i+1); 
        list.set(i+1, list.get(high));
        list.set(high, temp); 
  
        return i+1; 
	}
		
}
