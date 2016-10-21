package comtiida;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NissanTiida tiidaa=new NissanTiida();
		int Hint;
		do{
		System.out.print("please enter a number:");
		Scanner input=new Scanner(System.in);
		Hint=input.nextInt();
		for(int i=1;i<=Hint;i++){
		for(int j=1;j<=Hint;j++){
			tiidaa.tiida();
		}
		System.out.println();
		}
		}while(Hint!=0);

	}

}
