import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=1,c=0,r=0,t,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		t=l;
		l=c;
		c=t;
		}else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		t=c;
		c=r;
		r=t;
		}else{
		t=l;
		l=r;
		r=t;
		}
		}
		if(l==1){ System.out.println(l); }
		if(c==1){ System.out.println(2); }
		if(r==1){ System.out.println(3); }
	}

}
