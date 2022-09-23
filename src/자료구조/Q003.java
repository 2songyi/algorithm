package 자료구조;

import java.io.IOException;
import java.util.Scanner;

/**
 * 구간합 구하기
 * @author song
 *
 */
public class Q003 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N+1]; // 배열의 길이를 하나 늘린다.
		
		arr[0] = 0;
		
		for (int i=1; i<=N; i++) {
			arr[i] = arr[i-1] + sc.nextInt(); // 누적합을 배열에 저장한다.
		}
		
		for (int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(arr[b]-arr[a-1]);
		}
	}

}
