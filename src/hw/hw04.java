package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入二個數");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(fun(a,b));
	}
	public static int fun(int a,int b){
		int max=1;
		for(int i = 2;i <= a; i++){
			if(a%i==0 && b%i==0){
				max=i;
			}
		}
		return max;
	}
}
