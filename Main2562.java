package javaProfessioner;

import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];			// 정수 9개를 담을 배열 선언
		
		for(int i = 0 ; i < arr.length ; i ++)			// 배열에 9개의 수를 넣음
		{
			arr[i]=sc.nextInt();
			
		}
		
		int max = arr[0];			// 기준이 될 첫번 째 값을 max에 넣음 
		int index = 0 ;			// 최대값의 위치를 알아낼 변수 생성
		
		for(int i = 1 ; i < arr.length ; i ++)
		{
			if(arr[i] > max) 			// max는 arr[0]이니까, max보다 큰 값이 있으면 그 값이 max가 됨.
			{							
				max = arr[i];
				index = i+1;			// max가 된 값의 위치를 index에 저장
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
}