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

        System.out.printf("1. 고객 정보 확인\t\t2. 장바구니 상품 목록 보기\n");
        System.out.printf("3. 장바구니 비우기\t\t4. 바구니에 항목 추가하기\n");
        System.out.printf("5. 장바구니 수정하기\t\t6. 장바구니 삭제하기\n");
        System.out.println("7. 영수증 표시하기\t\t8. 종료\n");

        System.out.println();
        System.out.print("메뉴 번호 선택 : ");
        int num = data.nextInt();
        System.out.printf("%d번을 선택합니다.", num);
    }
}