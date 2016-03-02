import java.util.Scanner;
public class Decode {
public static void main(String[] args) {
	String num1,num2;
	char b;
	int a=0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter text : ");
	num1=scan.nextLine();
	num2=num1.toUpperCase();
	for(a=num2.length()-1;a>=0;a--)
	{
		b=num2.charAt(a);
		if(b=='E'){
			b='R';
	}
		else if(b=='R'){
			b='W';
		}
		else if(b=='W'){
			b='E';
		}
		System.out.print(b);
	}
  }
}