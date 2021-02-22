package step2_01.array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		
		while (isRun) {
			//계좌 중복 사슬
			int accErr = -1;
			//삭제 확인 사슬
			int delErr = -1;
			//가득 차 있는지 사슬
			int fullErr = -1;
			
			System.out.println("***************************************");
			System.out.println("현재 고객명단");
			for(int i = 0 ;  i < accsCnt; i++	) {
				System.out.print(accs[ i ] + " ");
			}
			System.out.println();
			for(int i = 0 ;  i < accsCnt; i++	) {
				System.out.print(pws[ i ] + " ");
			}
			System.out.println();
			System.out.println("현재 가입된 고객님 수 : " + accsCnt);
			System.out.println("***************************************");
			System.out.println();
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				if(accsCnt == 5 ) {
					System.out.println("고객님이 가득차 회원가입을 진행할수 없습니다.");
					continue;
				}
		
				System.out.println("개설하실 계좌를 입력하세요 : 0000");
				int newAcc = scan.nextInt();
				
				System.out.println("---------------------------------------");
				System.out.println("입력하신 계좌 : " + newAcc);
				System.out.println("---------------------------------------");
				System.out.println();
				
				//중복검사
				for(int i = 0 ; i < accs.length; i++) {
					if(newAcc == accs[ i  ]) {
						System.out.println("이미 있는계좌입니다");
						System.out.println();
						accErr = 1;
						break;
					}
				}
				if(accErr == 1) {
					continue;
				}
				
				//비밀번호설정
				System.out.println("비밀번호를 설정하세요 : ");
				int newPw = scan.nextInt();
				
				System.out.println("---------------------------------------");
				System.out.println("비밀번호 설정완료");
				System.out.println("---------------------------------------");
				System.out.println();
				
				//배열에 정보저장
				accs[accsCnt] = newAcc;
				pws[accsCnt] = newPw;
				accsCnt++;
			}
			//탈퇴
			else if (selectMenu == 2) {
				int delIndex = 0;
				if(accsCnt == 0) {
					System.out.println();
					System.out.println("현재 가입되어 있는 고객님이 없어 탈퇴를 진행할수 없습니다.");
					continue;
				}
				System.out.println();
				System.out.println("탈퇴하실 아이디를 입력하세요 : ");
				int delAcc = scan.nextInt();
				//id 조회
				for(int i = 0 ; i < accs.length; i++) {
					if(accs[ i ] == delAcc) {
						delIndex = i ;
						delErr = 1;
					}
				}
				if( delErr == -1 ) {
					System.out.println("입력하신 고객님이 존재하시 않습니다.");
					continue;
				}
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println(accs[delIndex] + " 고객님 탈퇴절차 진행");
				
				System.out.println("비밀번호를 입력하세요 : ");
				int delPw = scan.nextInt();
				//비밀번호 일치여부 확인
				if(pws[delIndex] == delPw) {
					System.out.println("탈퇴처리 되었습니다.");
					System.out.println("---------------------------------------");
					System.out.println();
			//                                 dI         aC     
//					int[] accs = {1001, 1002, 1003, 1004, 0};
//					int[] pws  = {1111, 2222, 3333, 4444, 0};
					
					//accs 정렬
					for (int i = delIndex; i < accsCnt - 1; i++) {
						accs[i] = accs[i + 1];
						pws[i] = pws[i + 1];
					}
					accsCnt --;
					continue;
				}
				else {
					System.out.println("비밀번호 오류, 탈퇴 불가능");
					continue;
				}
				
			}
			else if (selectMenu == 3) {
				System.out.println("ATM EXIT" );
				isRun = false;
			}
			
		}

	}
}
