package src;

import java.util.Scanner;

public class prob_03_02 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = data.next();
        System.out.print("전화번호를 입력하세요 : ");
        String phone_num = data.next();

        System.out.println("***************************************");
        System.out.println("       Welcome To Shopping Mall");
        System.out.println("        Welcome To BookMarket");
        System.out.println("***************************************");
        System.out.printf("%-17s", "1. 고객 정보 확인");
        System.out.printf("%-17s\n", "2. 장바구니 상품 목록 보기");
        System.out.printf("%-17s", "3. 장바구니 비우기");
        System.out.printf("%-17s\n", "4. 바구니에 항목 추가하기");

        System.out.printf("%-17s", "5. 장바구니 수정하기");
        System.out.printf("%-17s\n", "6. 장바구니 삭제하기");

        System.out.printf("%-17s", "7. 영수증 표시하기");
        System.out.printf("%-17s\n", "8. 종료");

        System.out.println();
        System.out.print("메뉴 번호 선택 : ");
        int num = data.nextInt();
        System.out.printf("%d번을 선택합니다.", num);
    }
}