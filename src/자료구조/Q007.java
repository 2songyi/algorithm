package 자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class Q007 {
	public static void main(String[] args) {
		/**
		 * 배열에 값을 담고 오름차순 정렬한다.
		 * 투포인터로 두개의 합을 구하고 조건이 일치하면 카운트한다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 재료의 개수
		int M = sc.nextInt(); // 구하고자 하는 값
		int count = 0;
		
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		
		int i = 0; // 맨 앞에서 시작
		int j = N - 1; // 맨 뒤에서 시작
		
		while(i < j) {
			if (arr[i] + arr[j] > M) {
				j--; // 값이 클 경우 j--해서 값을 낮춰준다
			} else if (arr[i] + arr[j] == M) {
				count++;
				i++;
				j--;
			} else if (arr[i] + arr[j] < M) {
				i++; // 작을경우 i++해서 값을 키워준다
			}
		}
		
		System.out.println(count);
		
		
		
		
	}
}	
