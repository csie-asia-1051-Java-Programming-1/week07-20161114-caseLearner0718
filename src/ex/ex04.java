package ex;
/*
 * Date: 2016/11/14
 * Author: 105021025 洪立宇
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println(fun(a));
	}
	public static int fun(int x){
		if(x==1){
			return x;
		}else{
			return x*fun(x-1);
		}
	}
}
