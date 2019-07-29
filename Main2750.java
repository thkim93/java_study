package javaProfessioner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i ++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int temp = 0;
		
		for(int i = 0 ; i < arr.length-1; i ++)
		{
			for(int j = 0 ; j < arr.length-1 ; j ++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < n ; i ++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
