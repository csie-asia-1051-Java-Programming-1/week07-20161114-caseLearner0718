package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		System.out.println(fun(val));
	}
	public static int fun(int val){
		if(val<10){
			return 1;
		}else{
			return 1 + fun(val/10);
		}
	}
}
