import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpRead 
{
public static void main(String[] args) 
{
	FileInputStream f=null;
	try 
	{
		f=new FileInputStream("Edata.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		Object o1 = o.readObject();
		Emp e=null;
		if(o1 instanceof Emp)
		{
			e=(Emp) o1;
		}
		System.out.println(e.name+" "+e.profile+" "+e.sal+" "+e.comm);
		o.close();
	} 
	catch (IOException | ClassNotFoundException e) 
	{
		
		e.printStackTrace();
	}
}
}
