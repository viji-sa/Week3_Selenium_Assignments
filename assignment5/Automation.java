package week3.day1.ha.assignment5;
/*
 * Assignment 5 on Abstraction
===========
Interface :Language
     Methods   :Java()
     
Interface :TestTool
     Methods   :Selenium()
     
AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
     
Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
*/

public class Automation extends MultipleLangauge implements Language,TestTool{

	@Override
	public void Java() {
		System.out.println("from Language");		
	}
	
	@Override
	public void Selenium() {
			System.out.println("from Testtool");
	}

	@Override
	public void ruby() 
		{
			System.out.println("ruby");
		}
	

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}
	
		

}
