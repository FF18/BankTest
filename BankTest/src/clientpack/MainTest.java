package clientpack;

//import java.io.*;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class MainTest {

	public static void main(String[] args)/* throws IOException*/ {
		Regulars regulars = new Regulars();
		Golds golds = new Golds();
		Platinums platinums = new Platinums();
		System.out.println("Please Please Please Please : ");
		
		switch( getWithdraw()) {
		case 1:
			System.out.println(regulars);
			break;
		case 2:
			System.out.println(golds);
			break;
		case 3:
			System.out.println(platinums);
			break;
		default:
			break;
	}
//		InputStreamReader r=new InputStreamReader(System.in);  
//		BufferedReader br=new BufferedReader(r);  
//		  
//		System.out.println("Enter your name");  
//		String name=br.readLine();  
//		System.out.println("Welcome "+name);  
	}

	private static int getWithdraw() {
		return 0;
	}
}
