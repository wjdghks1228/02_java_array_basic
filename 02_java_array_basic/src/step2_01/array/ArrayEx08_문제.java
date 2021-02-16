package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */

public class ArrayEx08_문제 {

	public static void main(String[] args) {

		int[] answer = { 1, 3, 4, 2, 5 };
		int[] hgd = new int[5];
		char[] ox = new char[5];
		
		//hgd랜덤값 저장
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int randNum = rand.nextInt(5) + 1;
			hgd[i] = randNum;
		}
		
		//정오표 생성
		for (int i = 0; i < 5; i++) {
			if (answer[i] == hgd[i]) {
				ox[i] = 'O';
			} else {
				ox[i] = 'X';
			}
		}
		
		//score매기기
		int score = 0;
		for (int i = 0; i < 5; i++) {
			if (ox[i] == 'O') {
				score += 10;
			}
		}
		// answer 출력
		System.out.print("answer   ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print("[");
//			System.out.print(answer[i] + "");
//			System.out.print("]");
//		}
		System.out.println(Arrays.toString(answer));

		// hgd출력
		System.out.print("hgd      ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print("[");
//			System.out.print(hgd[i] + "");
//			System.out.print("]");
//		}
		System.out.println(Arrays.toString(hgd));

		// 정오표출력
		System.out.print("check    ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print("[");
//			System.out.print(ox[i] + "");
//			System.out.print("]");
//		}
		System.out.println(Arrays.toString(ox));

		System.out.println();
		System.out.println("총점 : " + score);

	}

}
