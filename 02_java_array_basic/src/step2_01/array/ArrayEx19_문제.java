package step2_01.array;

import java.util.Scanner;
//2021_02_19 time -- > 21:30 ~ 21:
/*
 * # 배열 컨트롤러[1단계] : 추가
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 소스를 이해하고 동작해본뒤 정답에 코드를 작성해보자.
 * 
 */

public class ArrayEx19_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int elementCnt = 2;

		while (true) {
			System.out.println();
			System.out.println("[메뉴]");
			System.out.println("[1] 현재 배열 출력");
			System.out.println("[2] 추가");
			int sel  = scan.nextInt();
			if( sel >= 3) {
				System.out.println("없는 메뉴 입니다.");
				continue;
			}
			if(sel == 1) {
				for ( int i = 0 ;  i < elementCnt  ; i ++) {
					System.out.print(arr[i] + " ");
				}
				continue;
			}
			if(sel == 2) {
				if(elementCnt == 5) {
					System.out.println("배열이 꽉찾습니다. 삭제후 다시 입력하세요");
					continue;
				}
				System.out.println("값을 입력하세요 : ");
				int inputNum = scan.nextInt();
				arr[elementCnt] = inputNum;
				elementCnt ++ ;
			}
				
		}

	}

}
