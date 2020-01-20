package javaProfessioner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10798{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[5];		// 문자열 배열 5개 선언 ( 5줄 )
		char[][] chs = new char[5][15];		// 문자열이 들어갈 문자형 배열 선언
		
		for(int i = 0 ; i < 5 ; i ++)
		{
			str[i] = br.readLine();		// 문자열을 입력 받고
			
			for(int j = 0 ; j < str[i].length() ; j ++)		// 문자열의 길이만큼
			{
				chs[i][j] = str[i].charAt(j);		// charAt 함수를 사용하여 문자형 배열에 하나씩 넣음
			}
		}
		
		for(int i = 0 ; i < 15 ; i ++)		
		{
			for(int j = 0 ; j < 5 ; j ++)
			{
				if(chs[j][i]==' ' || chs[j][i]=='\0')		// 공백 또는 null문자가 나오면 continue!
					continue;
				System.out.print(chs[j][i]);		// 세로로 출력
			}
		}
		
	}
}