package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 구간합 구하기
 * @author song
 *
 */
public class Q003 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in)); //bufferedReader 한줄씩 읽음
		StringTokenizer stringTokenizer = new StringTokenizer(bufferReader.readLine()); //지정한 구분자로 문자열 쪼개기
		// readline->데이터를 한줄로 읽어서 string으로 바꾸는 메서드
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); //string으로 읽어온 값을 int로 변환
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[suNo + 1];
		stringTokenizer = new StringTokenizer(bufferReader.readLine());
		
		for (int i=1; i<=suNo; i++) {
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int q=0; q<quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferReader.readLine());
			int i= Integer.parseInt(stringTokenizer.nextToken());
			int j= Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
	}

}
