package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jm,n");
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(fun(m)/(fun(n)*fun(m-n)));
	}
	public static int fun(int x){
		if(x==1){
			return x;
		}else{
			return x*fun(x-1);
		}
	}
}