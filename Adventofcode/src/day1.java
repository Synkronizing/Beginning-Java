import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		ArrayList<Integer> inputs = new ArrayList<>();
		File file = 
			      new File("/home/compsci/Documents/numbers"); 
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			inputs.add(Integer.parseInt(line));
			
		}
		int fueltot=0;
		int fueltot2=0;
		for(int a = 0; a< inputs.size();a++) {
			int masstemp = inputs.get(a);
			int fueltemp = (int)Math.floor(masstemp/3)-2;
			int extrafuel = (int)Math.floor(fueltemp/3)-2;
			fueltot2 = fueltot2+fueltemp;
			while(extrafuel>0) {
				fueltot2 = fueltot2+extrafuel;
				extrafuel = (int)Math.floor(extrafuel/3)-2;
			}
			fueltot = fueltot+fueltemp;
			
		}
		
		System.out.println(fueltot);
		System.out.println(fueltot2);
	}
}
