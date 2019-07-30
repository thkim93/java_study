package javaProfessioner;
import java.util.Scanner;

public class Main2439{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i ++)		// n번 반복을 해야하므로 i 는 n 까지
		{
			for(int j = n; j > i+1 ; j --)	// 공백을 출력하는 반복문
			{
				System.out.print(" ");
			}
			
			for(int k = 0; k < i+1; k ++)	// 별을 출력하는 반복문
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
