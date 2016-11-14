package ex;
/*
 * Date: 2016/11/14
 * Author: 105021025 洪立宇
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入你要的二維陣列大小");
		int x = scn.nextInt();
		int y = scn.nextInt();
		float sum=0;
		int a=1;
		float tal=0;
		float[][] val = new float[x][y];
		for(int b=0;b<x;b++){
			for(int c=0;c<y;c++){
				System.out.println("請輸入第" + a +"筆資料");
				a++;
				val[b][c] = scn.nextFloat();
			}
		}
		for(int b=0;b<x;b++){
			for(int c=0;c<y;c++){
				sum = sum + val[b][c];
			}
		}
		sum/=(x*y);
		for(int b=0;b<x;b++){
			for(int c=0;c<y;c++){
				tal += fun(val[b][c],sum);
			}
		}
		System.out.println("變異數:" + tal/(x*y));
		System.out.println("標準差:" + std(tal/(x*y)));
	}
	public static float fun(float val,float sum){
		val = (val-sum)*(val-sum);
		return val;
	}
	public static double std(double x){
		x=Math.pow(x,1/2);
		return x;
	}
}
