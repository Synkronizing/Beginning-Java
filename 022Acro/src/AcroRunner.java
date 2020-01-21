import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AcroRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> all = new ArrayList<String>();
		File file = 
			      new File("/home/compsci/eclipse-workspace/022Acro/acro.dat"); 
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] words = line.split(",");
			String given = words[0];	
			all.add(given);
		}
		Acronym translation = new Acronym(all);
	}

}
