package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx21_문제 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int elementCnt = 2;
		int selectMenu = 0;
		int log =  - 1 ;
		while ( true ) {
			if ( log == 1 ) {
				System.out.println("현재 배열이 가득찬 상태 , 해결후 삽입 하세요 ");
				break;
			}
			
			//현재배열출력
			for( int i = 0 ; i < elementCnt ; i ++) {
				System.out.print(arr[ i ] + " ");
			}
			System.out.println();
			
			//삽입할 위치
			System.out.println("삽입할 위치를 입력하세요 : ");
			if( elementCnt == 5 ) {
				System.out.println("배열이 가득차 삽입할수가 없습니다.");
				log = 1;
				continue;
			}
			int plusValue = scan.nextInt();
			
			System.out.println("삽입할 값을 입력하세요 : ");
			int inputValue  = scan.nextInt();
			// 0  1  2  3   4  : index
			// 1  2  3  4   5  : elementCnt
			// 10 20 30 40     : 실제
			for ( int i  = elementCnt ; i > plusValue; i -- 	) {
				arr[ i ] = arr [ i - 1 ] ;
			}
			arr[ plusValue ] = inputValue;
			elementCnt ++ ;
			System.out.println("배열 출력");
			System.out.println("--------------------------------------------------------");
			for(int i = 0 ; i < elementCnt ; i++	) {
				System.out.print(arr [ i ] + " ");
			}
			System.out.println();
			System.out.println("--------------------------------------------------------");
			}
	}
}
