package arrayex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File ob=new File("C:\\pubg\\file.txt");
		try {
		if(ob.createNewFile())
		{
			System.out.println("created");
			System.out.println(ob.canExecute());
			System.out.println(ob.canRead());
			System.out.println(ob.canWrite());
			
		}
	
		else
		{
			System.out.println("already exist");
		}
	}
	catch(IOException e) {}
	FileWriter w =new FileWriter(ob);
	try {
		w.write("100");
		w.write("\n");
		w.write("good afternoon");
	}
	catch(IOException f) {}
	w.close();
}
}

