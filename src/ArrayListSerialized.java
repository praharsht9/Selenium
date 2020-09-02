import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSerialized implements Serializable
{
private static final long serialVersionUID=1L;
public static void main(String[] args) 
{
	List<String> lst = new ArrayList<String>();
	lst.add("Pankaja");
	lst.add("oggi");
	lst.add("Pebo");
	lst.add("ABC");
	lst.add("DEF");
	lst.add("Suraj");
	lst.add("Moon");
	lst.add("Praharsh");
	
	try 
	{
		FileOutputStream fos = new FileOutputStream("ListData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(lst);
		oos.close();
		System.out.println("Done! Done! Done!");
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	
	
}
}
