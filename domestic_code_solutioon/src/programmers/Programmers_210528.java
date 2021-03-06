package programmers;

import java.util.Arrays;

public class Programmers_210528 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12933
	//함수 solution은 정수 n을 매개변수로 입력받습니다. 
	//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	//예를들어 n이 118372면 873211을 리턴하면 됩니다.
	class Solution {
	    public long solution(long n) {
	    	//주어진 long 타입의 수 n을 String으로 변환한다.
	        String num = String.valueOf(n);
	        //문자열 답안을 선언한다.
			String strAnswer = "";
			//문자열 배열을 선언한다. 길이는 num의 문자열 배열의 길이를 집어넣는다.
			char[] arr = new char[num.length()];
			//num 문자열의 글자를 arr에 넣는다.
			for(int i=0;i<arr.length;i++) {
				arr[i] = num.charAt(i);
			}
			//arr 배열을 오름차순 정렬한다.
			Arrays.sort(arr);
			//arr 배열을 문자열 strAnswer에 넣는다.
			for(int i=arr.length-1;i>=0;i--) {
				strAnswer += arr[i];
			}
			//다시 long으로 형변환을 한다.
			long answer = Long.parseLong(strAnswer);
	        //리턴한다.
			return answer;
	    }
	}
}
