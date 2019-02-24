package bankpack;

import clientpack.*;
//import java.io.*;

public class BankMain {

	public static void main(String[] args) {
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

	}

	private static int getWithdraw() {
		return 0;
	}
}