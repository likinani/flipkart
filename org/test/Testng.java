package org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {
	
	@Parameters({"fst", "lst","phone","email","psw","cmp"})
	@Test
	public void xmple(String fst, String lst){
		System.out.println(fst);
		System.out.println(lst);
		
	}
	public void xmple1( String cmp, String email){
		System.out.println(email);
		System.out.println(cmp);}
	
	public void xmple2( int phone, String psw ){
			System.out.println(psw);
				System.out.println(phone);
		
	
	
}
}
