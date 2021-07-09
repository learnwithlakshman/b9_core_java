package com.careerit.cj.conditionalstmt;

public class LogicalAndExample {

		public static void main(String[] args) {
			
				boolean a = false, b= false, c= true;
				
				if(a || (b=true) || (c=false)) {
					System.out.println("OK");
				}
				
				System.out.println("A = "+a+" B = "+b+" C = "+c);
		}
}
