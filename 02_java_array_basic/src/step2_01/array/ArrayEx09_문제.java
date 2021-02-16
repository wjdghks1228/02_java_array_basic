package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;
//2021 08 04 Time : 20:04 ~ 20:18
/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [X] [O] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
		
		int moviePay = 0;
		
		
		while(true) {
			System.out.println(Arrays.toString(seat));
			System.out.println();
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			int sel = scan.nextInt();
			
			if(sel == 1 ) {
				System.out.print("예매 좌석 선택 (1~7) : ");
				int mySeat = scan.nextInt();
					if(seat [ mySeat - 1 ] == 'O') {
						System.out.println("이미 예약된 좌석입니다.");
						continue;
					}
					else {
						seat [ mySeat - 1 ] = 'O';
						moviePay += 12000;
					}
				
			}
			else if( sel == 2 ) {
				System.out.println("---------예매 종료--------");
				System.out.println("매출액 : " + moviePay);
				break;
			}
		}
		
	}
	
}
