package compassword;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String pa;
		do{
			Scanner input=new Scanner(System.in);
			System.out.print("please enter a password:");
			pa=input.next();
			PasswordEncorder cor=new PasswordEncorder();
			cor.encode(pa);
			System.out.println("");
		}while(pa!=("exit"));
		
	}


}
