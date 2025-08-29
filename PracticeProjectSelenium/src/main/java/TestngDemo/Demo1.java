package TestngDemo;

import org.testng.annotations.Test;

public class Demo1 {
@Test
public void demo1()
{
	System.out.println("Hello I am demo1");
}
@Test(groups = {"Smoke"})
public void testPractice()
{
	System.out.println("Hello I am second");
}
}
