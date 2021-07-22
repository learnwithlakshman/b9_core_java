package com.careerit.cj.strexamples;

public class StringBufferExample {

	public static void main(String[] args) {
				String data = "liril";
				if(data.equals(new StringBuilder(data).reverse().toString())) {
					System.out.println("Palindrome");
				}else {
					System.out.println("Not a Palindrome");
				}
				
//				<html>
//				<body>
//					Dear {}, your OTP : {} is valid for 30 seconds
//				 </body>  
//				</html>
				
				StringBuilder sb = new StringBuilder();
				sb.append("<html");
				sb.append("<body>");
				sb.append("Dear ").append("Krish").append(" your OTP : ").append("12398").append(" is valid for ").append("30").append(" seconds");
				sb.append("</body");
				sb.append("</html");
			   
				String emailTemplate = sb.toString();
				
				
		}
}
