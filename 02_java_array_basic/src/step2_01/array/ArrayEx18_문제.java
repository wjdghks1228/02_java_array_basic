package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//2021_02_19 time -- > 21:00 ~ 21:30
/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};// 9 10 11
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};//
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn1 = 0;
		int turn2 = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;	
		
		Random ran = new Random();
		System.out.println(Arrays.toString(p1));
		System.out.println(Arrays.toString(p2));
		System.out.println();
		System.out.println();
		while(true) {
			if( win1 == 1) {
				System.out.println("player1 victory !!!");
				break;
			}
			else if( win2 == 1) {
				System.out.println("player2 victory !!!");
				break;
			}
			
			//player 1
			System.out.println("player1 몇칸 이동 (1 ~ 3) : ");
			int moveP1 = scan.nextInt();
			p1[idx1] = 0;
			idx1 += moveP1;
			if(idx1 > 7) {
				idx1 -= 8;
				turn1 ++;
				if( turn1 == 3) {
					win1 = 1;
				}
			}
			p1[idx1] = 1;
			if( idx1 == idx2 ) {
				System.out.println("p1이 p2를 잡았다 ---> p2 0으로 초기화!");
				p2[idx2] = 0;
				idx2 = 0 ;
				p2[idx2] = 2;
				System.out.println(Arrays.toString(p1) + "     p1 turn : " + turn1);
				System.out.println(Arrays.toString(p2) + "     p2 turn : " + turn2);
			}
			
			//player 2
			int randMove = ran.nextInt(3)+1;
			System.out.println("player2 "  + randMove + "칸 이동");
			p2[idx2] = 0;
			idx2 += randMove;
			if(idx2 > 7) {
				idx2 -= 8;
				turn2 ++;
				if(turn2 == 3) {
					win2 = 1;
				}
			}
			p2[idx2] = 2;
			if( idx1 == idx2 ) {
				System.out.println("p2가 p1을 잡았다 ---> p1 0으로 초기화!");
				p1[idx1] = 0 ;
				idx1 = 0;
				p1[idx1]= 1;
			}
			System.out.println(Arrays.toString(p1) + "     p1 turn : " + turn1);
			System.out.println(Arrays.toString(p2) + "     p2 turn : " + turn2);
		}
		
	}
}
