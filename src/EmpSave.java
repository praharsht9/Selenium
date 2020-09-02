import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSave 
{
	
public static void main(String[] args) 
{
	Emp e = new Emp();//creating object
	e.name="Pankaja";
	e.profile="HR";
	e.sal=1500;
	e.comm=500.50;
	try 
	{
		FileOutputStream f = new FileOutputStream("Edata.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(e);
		o.close();
		System.out.println("Done!");
		
	} 
	catch (IOException e1) 
	{
		e1.printStackTrace();
	}

	
}
}
