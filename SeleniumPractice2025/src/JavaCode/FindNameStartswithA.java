package JavaCode;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class FindNameStartswithA {
	@Test
	public void streamfilter()
	{
		ArrayList<String> names=new ArrayList();
		names.add("Alexis");
		names.add("Alfredo");
		names.add("Maggie");
		names.add("Daniel");
		names.add("Mahid");
		
		long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
	}
	

}
