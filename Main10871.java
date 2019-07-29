package javaProfessioner;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main108712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();			// 입력을 받고
		StringTokenizer stk = new StringTokenizer(str);			// 받은 문자를 공백으로 나눈 후, 차례대로 토큰으로 지정 
		int n = 0 ;
		int m = 0 ;
		
		while(stk.hasMoreTokens()) {			// 토큰이 있으면 True
			n = Integer.parseInt(stk.nextToken());			// 받은 문자 int형으로 형변환 ( 입력받을 숫자의 개수 )
			m = Integer.parseInt(stk.nextToken());			// 받은 문자 int형으로 형변환 ( 기준이 될 숫자 )
		}
		
		str = br.readLine();
		stk = new StringTokenizer(str);
		
		while(stk.hasMoreTokens()) {			/// 토큰이 있으면 True
			int num = Integer.parseInt(stk.nextToken());			// 순서대로 토큰을 num에 넣음
			
			if(num < m)			// num이 기준이 될 숫자 m보다 작으면 출력 !
				System.out.print(num+" ");
		}
		
		
	}
	
}
