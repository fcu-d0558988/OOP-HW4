package compassword;

public class PasswordEncorder {
public String encode(String password){
		for(int i=0;i<password.length();i++)
		{
			char str=password.charAt(i);
			if(str=='a'||str=='A'){
				System.out.print("4");
			}
			
			else if(str=='e'||str=='E'){
				System.out.print("3");
			}
			else if(str=='i'||str=='I'){
				System.out.print("1");
			}
			
			else if(str=='o'||str=='O'){
				System.out.print("0");
			}
			else if(str=='t'||str=='T'){
				System.out.print("7");
			}
			else
				System.out.print(str);
		}
		return "";
	}
}
