package javaProfessioner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978{
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		str = br.readLine();
		StringTokenizer stk = new StringTokenizer(str);
		int hap=0;
		
		while(stk.hasMoreTokens())			// 토큰이 있으면 True
		{
			int tg = Integer.parseInt(stk.nextToken());			//Int 형으로 형변환
			int cnt = 0;
			
			for(int i = 1 ; i <= tg; i++)			// 1부터 tg자기 자신까지 나눔
			{
				if(tg%i==0)			// 나누었을 때 나머지가 0인 경우에만 cnt 1 증가 !
					cnt++;
			}
			
			if(cnt==2) {			// cnt가 2일 경우에는 소수이므로 hap을 1 증가 ( 1로 나누고 자기 자신으로 나누었을 경우에만 2가 됨 )
				hap++;
			}
		}
		
		System.out.println(hap);			// 소수의 개수 hap 출력
		
	}
}
