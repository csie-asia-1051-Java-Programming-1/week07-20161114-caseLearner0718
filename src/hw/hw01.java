package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三個數");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		System.out.println(fun(fun(a,b),c));
	}
	public static int fun(int a,int b){
		int max=1,min;
		for(int i = 2;i <= a; i++){
			if(a%i==0 && b%i==0){
				max=i;
			}
		}
		min=a*b/max;
		return min;
	}
}
