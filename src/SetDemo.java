import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) 
{
	Set<String> s = new HashSet<String>();
	s.add("Digamabr");
	s.add("Pankaja");
	s.add("AAA");
	s.add("BBB");
	s.add("CCC");
	s.add("DDD");
	s.add("EEE");
	s.add("FFF");
	
	for(String pop : s) {
		System.out.println(pop);
	}
	String Name="CCC";
	s.remove(Name);
	System.err.println("************************");
	for(String pop : s) {
		System.out.println(pop);
	}
	
}
}
