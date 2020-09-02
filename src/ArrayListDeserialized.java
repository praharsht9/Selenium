import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayListDeserialized 
{
public static void main(String[] args) 
{
	ArrayList<String> lst = new ArrayList<String>();
	try 
	{
		FileInputStream fis = new FileInputStream("ListData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		lst = (ArrayList) o;
		ois.close();
	} 
	catch (IOException | ClassNotFoundException e) 
	{
		e.printStackTrace();
	}
	for(String n : lst)
	{
		System.out.println(n);
	}
}
}
