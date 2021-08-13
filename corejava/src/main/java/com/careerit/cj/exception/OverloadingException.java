package com.careerit.cj.exception;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class E1 extends Exception{
	
}
class E2 extends E1{
	
}
class E3 extends E2{
	
}

class C1{
	void show()throws E1{
		
	}
}
class C2 extends C1{
	
	void show() throws E2 {
		
	};
}

class MyReader implements Closeable{

	@Override
	public void close() throws IOException {
		
		
	}

	
}
public class OverloadingException {

	
		public static void main(String[] args) {
			
			
				try(BufferedReader br = new BufferedReader(new FileReader(new File("Hello.txt")))){
					
					try {
						
					}catch (Exception e) {
						// TODO: handle exception
					}
				}catch (IOException e) {
					try {
						
					}catch (Exception e1) {
						// TODO: handle exception
					}
				}finally {
					
				}
		}
}
