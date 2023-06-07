import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager(new Scanner(System.in));

        Scanner scanner = new Scanner(System.in);

        System.out.println("도서 관리 시스템");
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 목록 출력");
        System.out.println("3. 도서 검색");
        System.out.println("4. 도서 대여");
        System.out.println("5. 알람 추가");
        System.out.println("6. 도서 반납");
        System.out.println("7. 책 저장");
        System.out.println("8. 책 로드");
        System.out.println("0. 종료");

        while (true) {
            System.out.print("> 원하는 기능을 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1 : {
                    System.out.println("도서 추가");
                    System.out.print("> 제목: ");
                    String title = scanner.nextLine();
                    System.out.print("> 작가: ");
                    String author = scanner.nextLine();
                    System.out.print("> 출판사: ");
                    String publisher = scanner.nextLine();
                    System.out.print("> 가격: ");
                    double price = scanner.nextDouble();
                    System.out.print("> 개수: ");
                    int num_book = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거

                    Book book = new Book(title, author, publisher, price, num_book);
                    bookManager.addBook(book);

                    System.out.println("도서가 추가되었습니다..");
                    break;
                }
                case 2 : {
                    System.out.println("도서 목록 출력");
                    bookManager.displayAllBooks();
                    break;
                }
                case 3 : {
                    System.out.print("> 검색할 책 제목: ");
                    String searchTitle = scanner.nextLine();
                    bookManager.searchBookByTitle(searchTitle);
                    break;
                }
                case 4 : {
                    System.out.print("> 빌릴 책 제목: ");
                    String borrow_book_title = scanner.nextLine();
                    bookManager.borrowBook(borrow_book_title);
                    break;
                }
                case 5 : {
                    System.out.print("> 관심 책 제목: ");
                    String book_title = scanner.nextLine();
                    System.out.print("> 요청자 이름: ");
                    String name = scanner.nextLine();
                    System.out.print("> 숫자 1 (전화), 숫자2 (카카오메시지): ");
                    int alarm_type = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거
                    bookManager.addAlarm(book_title, alarm_type, name);
                    break;
                }
                case 6 : {
                    System.out.print("> 반납 책 제목: ");
                    String book_title = scanner.nextLine();
                    bookManager.returnBook(book_title);
                    break;
                }
                case 7 : {
                    bookManager.save("book.csv");
                    System.out.println("책 저장 완료...");
                    break;
                }
                case 8 : {
                    bookManager.load("book.csv");
                    System.out.println("책 로드 완료...");
                    break;
                }
                case 0 : {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                }
                default : System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }

            System.out.println();
        }
    }
}

