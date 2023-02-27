package Day1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateAndSwapiig {

	public static void main(String[] args) {
		//1. Print single letter
		
		String name = "Bangladesh";
		
		System.out.println(name.charAt(5));
		
		//2.Combine string value
		
		String a = "I";
		String b = "am";
		String c = "a";
		String d = "QA";
		String e = "engineer";
		System.out.println(a+" "+b+" " +" "+c+" "+d+" "+e);
		
		//11-1= 10
		//3.Reverse value
		
		String country = "Switzerland";
		
		char [] rev = country.toCharArray();
		
		for(int i= rev.length-1; i>=0; i--) {
			
			System.out.println(rev[i]);
			
			
		}
		System.out.println(country.length());
		System.out.println(rev.length);
		//4.split value
		
		String courses = "Java,Selenium,Mavan,TestNG,Cucumber,API";
		
		String []xy = courses.split(",");
		
		for(int j=0; j<xy.length;j++) {
			
			System.out.println(xy[j]);
		}
		//swiping value 
		
		int p = 100;
		int q= 200;
		
		System.out.println("Before swiping value of p is =" + p);
		System.out.println("Before swiping value of q is =" + q);
		
		p= p+q; //300
		q=p-q;//100
		p=p-q;//200
		
		System.out.println("After swiping value of p is =" + p);
		System.out.println("After swiping value of q is =" + q);
		
		//convert string to integer
		
		String price1= "8000";
		String price2= "9000";
		
		int p1 = Integer.parseInt(price1);
		int p2= Integer.parseInt(price2);
		
		System.out.println(p1+p2);
		
		//Duplicate value
		
		String []student = {"Tom","Bob","July","Tom","Bob"};
		
		Set<String>st = new HashSet<String>();
		
		for(String student1:student) {
			
			if(st.add(student1)==false) {
				
				System.out.println("Duplicate value are :" + student1);	
			}
			
		}
		
	}

}
