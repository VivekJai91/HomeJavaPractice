package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("execute beforeclass");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("execute afterclass");
	}
	
	
	
	@BeforeTest
	
	public void beforetest()
	{
		System.out.println("execute before test");
	}
	
	
	
	
	@BeforeMethod
	public void before()
	{
		System.out.println("execute before @test method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 method is passed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test1 method is passed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test1 method is passed");
	}

	@AfterTest
	public void  after()
	{
		System.out.println("execute after @test method");
	}
	
	
	
	
	
	
	
}
