package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */
//2021_02_19 time -- > 20:30 ~ 21:00
public class ArrayEx17_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] game = new int[3][3];
		
		int basicNum = 1;
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print("[" + basicNum + "]");
				basicNum++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//log = 1 -> player1 
		//log = 2 -> player2
		int log = 1;
		
		//게임 시작 
		while(true) {
			
			//결과 검사
                 //		      j    j    j 
						//i 0,0  0,1  0,2
						//i 1.0  1.1  1.2
						//i 2.0  2.1  2.2
						
			//player1
			if ( log == 2) {
				//가로 검사
				for( int i = 0 ; i < 3; i++) {
					int lowCnt = 0;
					for (int j = 0; j < 3 ; j++) {
						if(game [ i ] [ j ] == 1	) {
							lowCnt++;
						}
					}
					if( lowCnt == 3) {
						System.out.println("player1 victory!!!");
						break;
					}
				}
			  	//세로검사
				for( int j = 0 ; j < 3; j++) {
					int colCnt = 0;
					for (int i = 0; i < 3 ; i++) {
						if(game [ i ] [ j ] == 1	) {
							colCnt++;
						}
					}
					if( colCnt == 3) {
						System.out.println("player1 victory!!!");
						break;
					}
				}
//			    j    j    j 
							//i 0,0  0,1  0,2
							//i 1.0  1.1  1.2
							//i 2.0  2.1  2.2
							//세로검사
				//좌상단 - 우하단 (\) 대각검사
				//i -> 0 1 2
				//j -> 0 1 2
				int crossCnt1 = 0;
				int  j = 0;
				for(int i = 0 ; i < 3 ; i++) {
					if( game [ i ] [ j ] == 1) {
						crossCnt1 ++;
						j++;
					}
				}
				if(crossCnt1 == 3 ) {
					System.out.println("player1 victory!!!");
					break;
				}
				
				//좌하단 - 우상단 (/) 대각검사
				//i -> 2 1 0
				//j -> 0 1 2
				int crossCnt2 = 0;
				 j = 0 ;
				for(int i = 2; i >=0 ; i--) {
					if( game [ i ] [ j ] == 1 ) {
						crossCnt2++;
					}
					j++;
				}
				if(crossCnt2 == 3) {
					System.out.println("player1 victory!!!");
					break;
				}
			}
			
			if(log == 1 ) {
				//가로 검사
				for( int i = 0 ; i < 3; i++) {
					int lowCnt = 0;
					for (int j = 0; j < 3 ; j++) {
						if(game [ i ] [ j ] == 2 ) {
							lowCnt++;
						}
					}
					if( lowCnt == 3) {
						System.out.println("player2 victory!!!");
						break;
					}
				}
			  	//세로검사
				for( int j = 0 ; j < 3; j++) {
					int colCnt = 0;
					for (int i = 0; i < 3 ; i++) {
						if(game [ i ] [ j ] == 2 ) {
							colCnt++;
						}
					}
					if( colCnt == 3) {
						System.out.println("player2 victory!!!");
						break;
					}
				}
//			    j    j    j 
							//i 0,0  0,1  0,2
							//i 1.0  1.1  1.2
							//i 2.0  2.1  2.2
							//세로검사
				//좌상단 - 우하단 (\) 대각검사
				//i -> 0 1 2
				//j -> 0 1 2
				int crossCnt1 = 0;
				int j = 0;
				for(int i = 0 ; i < 3 ; i++) {
					if( game [ i ] [ j ] == 2) {
						crossCnt1 ++;
						j++;
					}
				}
				if(crossCnt1 == 3 ) {
					System.out.println("player2 victory!!!");
					break;
				}
				
				//좌하단 - 우상단 (/) 대각검사
				//i -> 2 1 0
				//j -> 0 1 2
				int crossCnt2 = 0;
			    j = 0 ;
				for(int i = 2; i >=0 ; i--) {
					if( game [ i ] [ j ] == 2 ) {
						crossCnt2++;
					}
					j++;
				}
				if(crossCnt2 == 3) {
					System.out.println("player2 victory!!!");
					break;
				}
			}
			
			//판출력
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					if(game [ i ] [ j ] == 1 ) {
						System.out.print("[O]");
					}
					else if ( game  [ i ] [ j ] == 2 ) {
						System.out.print("[X]"); 
					}
					else {
						System.out.print("[ ]");
					}
				}
				System.out.println();
			}
			System.out.println();
			// 1 2 3
			// 4 5 6
			// 7 8 9
			if(log == 1 ) {
				System.out.println("player1 : ");
				int player1 = scan.nextInt();
				int y = (player1 - 1) / 3;
				int x = (player1 - 1) % 3;
				//판에서 기입 
				if( game [ y ] [ x ] != 1 && game [ y ] [ x ] != 2 ) {
					game [ y ] [ x ] = 1;
					log = 2 ;
					continue;
				}
				else {
					System.out.println("이미 선택된 자리입니다.");
					continue;
				}
				
				
			}
			else if( log == 2 ) {
				System.out.println("player2 : ");
				int player2 = scan.nextInt();
				int y = (player2 - 1) / 3;
				int x = (player2 - 1) % 3;
				//판에서 기입 
				if( game [ y ] [ x ] != 1 && game [ y ] [ x ] != 2 ) {
					game [ y ] [ x ] = 2;
					log = 1 ;
					continue;
				}
				else {
					System.out.println("이미 선택된 자리입니다.");
					continue;
				}
			}
		}
		
	}
		
}
