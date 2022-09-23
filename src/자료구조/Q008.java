package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q008 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int result = 0;
		long[] A = new long[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A);
		
		for (int k=0; k<N; k++) {
			int i = 0;
			int j = N - 1;
			long find = A[k];
			
			while(i<j) {
//				if (A[i])
			}
			
		}
	}

}
