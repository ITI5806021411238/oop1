//ข้อ1  
import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		a1 = scan.nextInt();
		System.out.print("Enter Number 2 : ");
		a2 = scan.nextInt();
		System.out.print("Enter Number 3 : ");
		a3 = scan.nextInt();
		System.out.print("Enter Number 4 : 20");
		a4 = scan.nextInt();
		System.out.print("Enter Number 5 : ");
		a5 = scan.nextInt();
		System.out.print("Enter Number 6 : ");
		a6 = scan.nextInt();
		System.out.print("Enter Number 7 : ");
		a7 = scan.nextInt();
		System.out.print("Enter Number 8 : ");
		a8 = scan.nextInt();
		System.out.print("Enter Number 9 : ");
		a9 = scan.nextInt();
		sum = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 +a9;
		if(sum-(a9+a8)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7);
		}else if(sum-(a9+a7)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a8);
		}else if(sum-(a9+a6)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a7+"\n"
		+a8);
		}else if(sum-(a9+a5)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8);
		}else if(sum-(a9+a4)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8);
		}else if(sum-(a9+a3)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8);
		}else if(sum-(a9+a2)==100){
		System.out.println(a1+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8);
		}else if(sum-(a9+a1)==100){
		System.out.println(a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8);
		}else if(sum-(a8+a7)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a9);
		}else if(sum-(a8+a6)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a8+a5)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a6+"\n"
		+a7+"\n"
		+a9);
		}else if(sum-(a8+a4)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a9);
		}else if(sum-(a8+a3)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a9);
		}else if(sum-(a8+a2)==100){
		System.out.println(a1+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a9);
		}else if(sum-(a8+a1)==100){
		System.out.println(a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a9);
		}else if(sum-(a7+a6)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a7+a5)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a6+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a7+a4)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a5+"\n"
		+a6+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a7+a3)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a7+a2)==100){
		System.out.println(a1+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a7+a1)==100){
		System.out.println(a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a6+a5)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a6+a4)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a5+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a6+a3)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a4+"\n"
		+a5+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a6+a2)==100){
		System.out.println(a1+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a6+a1)==100){
		System.out.println(a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a5+a4)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a3+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a5+a3)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a4+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a5+a2)==100){
		System.out.println(a1+"\n"
		+a3+"\n"
		+a4+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a5+a1)==100){
		System.out.println(a2+"\n"
		+a3+"\n"
		+a4+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a4+a3)==100){
		System.out.println(a1+"\n"
		+a2+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a4+a2)==100){
		System.out.println(a1+"\n"
		+a3+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a4+a1)==100){
		System.out.println(a2+"\n"
		+a3+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a3+a2)==100){
		System.out.println(a1+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a3+a1)==100){
		System.out.println(a2+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}else if(sum-(a2+a1)==100){
		System.out.println(a3+"\n"
		+a4+"\n"
		+a5+"\n"
		+a6+"\n"
		+a7+"\n"
		+a8+"\n"
		+a9);
		}
		else{
		System.out.println("Error");
		}
		}
		}
