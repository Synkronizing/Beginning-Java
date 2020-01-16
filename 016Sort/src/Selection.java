

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Selection {
	public static void main(String[] args) throws IOException {
		Scanner myObj = new Scanner(System.in);
		ArrayList<String>  list = new ArrayList<String>();
		ArrayList<ArrayList<String>> big_list=new ArrayList<ArrayList<String>>();
		String year;
		    
		System.out.println("Enter a year between 1880-2018"); 
		year = myObj.nextLine();
		
		File file = 
			      new File("/home/compsci/Documents/names/yob"+year+".txt"); 
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			String[] words = line.split(",");
			list = new ArrayList<String>(Arrays.asList(words));
			big_list.add(list);
		}
		big_list = selectionSort(big_list);
		System.out.println(big_list);
		
		FileWriter writer = new FileWriter("selection.txt"); 
		
		for(ArrayList<String> arr: big_list) {
			String temp_line="";
			for(String str: arr) {
				temp_line=temp_line+str+" ";
				
			}
			writer.write(temp_line + System.lineSeparator());
		}
		
	
	}
	public static ArrayList<ArrayList<String>> selectionSort(ArrayList<ArrayList<String>> list){
		int i,j, minValue, minIndex;
		ArrayList<String> temp;
		for(i =0;i<list.size();i++) {
			minValue = Integer.parseInt(list.get(i).get(2));
			minIndex =i;
			for(j=i;j<list.size();j++) {
				int temp_val= Integer.parseInt(list.get(j).get(2));
				if(temp_val<minValue) {
					minValue = Integer.parseInt(list.get(j).get(2));
					minIndex = j;
				}
			}
			int temp_val2=Integer.parseInt(list.get(i).get(2));
			if(minValue<temp_val2) {
				temp=list.get(i);
				list.set(i, list.get(minIndex));
				list.set(minIndex,temp);
				
			}
		}
		return(list);
	}
}
