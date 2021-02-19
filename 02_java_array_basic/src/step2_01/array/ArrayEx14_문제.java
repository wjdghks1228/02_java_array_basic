package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

//2021_02_19  TIME : 19 : 37 ~ 19 : 50
/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		int now = 0 ;
		int findIndex = 0;
		int moveIndex = 0;
		
		while ( true ) {
			//현재 캐릭터 위치 출력
			for(int i = 0 ; i < game.length; i++) {
				if( game [ i] == 2 ) {
					System.out.print("O");
				}
				else {
					System.out.print("-");
				}
			}
			
			System.out.println();
			//이동안내
			System.out.println("왼쪽이동[1]    오른쪽이동[2]");
			int toGo = scan.nextInt();
			if( toGo  == 1 ) {
				//2위치 찾기
				for(int i = 0 ; i < game.length ; i++) {
					if( game[ i ] == 2 ) {
						now = i;
						if( now == 0 ) {
							break;
						}
						moveIndex = now - 1 ;
						
						//위치이동
						int temp = 0;
						temp = game [ now ];
						game [ now ] = game [ moveIndex ];
						game [ moveIndex ] = temp;
						temp = 0;
						break;
					}
				}
			}
			if( toGo  == 2 ) {
				//2위치 찾기
				for(int i = 0 ; i < game.length ; i++) {
					if( game[ i ] == 2 ) {
						now = i;
						if( now == 6) {
							break;
						}
						moveIndex = now + 1 ;
						
						//위치이동
						int temp = 0;
						temp = game [ now ];
						game [ now ] = game [ moveIndex ];
						game [ moveIndex ] = temp;
						temp = 0;
						break;
					}
				}
			}
		}
				
	}
	
}
