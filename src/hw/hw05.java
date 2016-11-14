package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int val = scn.nextInt();
		System.out.println(fun(val));
	}
	public static String fun(int val){
		if(val<10){
			return Integer.toString(val);
		}else{
			return Integer.toString(val%10) + fun(val/10);
		}
	}
}
