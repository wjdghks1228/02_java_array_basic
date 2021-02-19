package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//2021_02_19 time -- > 20:09 ~ 20:20
/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */


public class ArrayEx16_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		Random ran = new Random();
		
		//랜덤값 채우기
		int i = 0;
		while( i < 4 ) {
			int ranNum = ran.nextInt(4);
			if( isCheck[ranNum] != true ) {
				arr [ i ] = ranNum + 1;
				isCheck[ranNum] = true;
				i++;
			}
		}
		System.out.println("중복없는 숫자 생성완료!");
		System.out.println(Arrays.toString(arr));
		
		int findNum = 1;
		//게임 시작
		while(true) {
			int nineCnt = 0;
			for( i = 0 ; i < arr.length ; i++) {
				if ( arr [ i ] == 9 ) {
					nineCnt ++ ;
				}
			}
			if( nineCnt == 4 ) {
				System.out.println("게임종료");
				break;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println();
			
			System.out.println("찾을 숫자 : " + findNum);
			System.out.println("인덱스를 입력하세요 : ");
			int putNum = scan.nextInt();
			if( arr [ putNum - 1] == findNum ) {
				arr [ putNum -1 ] = 9 ;
				findNum ++ ;
				continue;
			}
			else {
				continue;
			}
			
		}
		
	}
	
}
