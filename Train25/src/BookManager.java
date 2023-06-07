import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class BookManager {
    private HashMap<String, Book> bookMap;  //
    private Scanner scanner;

    public BookManager(Scanner scanner) {
        bookMap = new HashMap<>();  // HashMap으로 초기화
        this.scanner = scanner;
    }

    public void addBook(Book book) {
        bookMap.put(book.getTitle(), book);  // 도서 제목을 key로 사용하여 도서 객체를 저장
    }

    public void displayAllBooks() {
        if (bookMap.size() == 0) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            List<Book> sortedBooks = new ArrayList<>(bookMap.values());
            Collections.sort(sortedBooks, Comparator.comparing(Book::getTitle));
            for (Book each_book : sortedBooks) {
                // TODO: 각 책의 정보를 출력하시오.

                each_book.displayInfo();
            }
        }
    }

    public void searchBookByTitle(String title) {
        Book book = bookMap.get(title);  // 도서 제목을 key로 사용하여 도서 객체를 가져옴
        if (book != null) {
            book.displayInfo();
            System.out.println();
        } else {
            System.out.println("해당하는 도서를 찾을 수 없습니다.");
        }
    }

    public void borrowBook(String title) {
        Book book = bookMap.get(title);  // 도서 제목을 key로 사용하여 도서 객체를 가져옴

        if (book != null) {
            // TODO: try catch 문을 만듬.
            try {
                book.setNewBorrow();
                System.out.println(title + " 도서를 대출했습니다.");
                if (!book.IsAvailable()) {
                    System.out.println("알림이 예약되었습니다.");
                    book.enableAlarms();
                }
            } catch (NotEnoughBookException e) {
                System.out.println("대출 실패: " + e.getMessage());
            }
        } else {
            System.out.println("도서를 찾을 수 없습니다");
        }
    }

    public void returnBook(String title) {
        Book book = bookMap.get(title);  // 도서 제목을 key로 사용하여 도서 객체를 가져옴

        if (book != null) {
            // TODO: try catch 문을 만듬
            try {
                book.returnBook();
                System.out.println(title + " 도서를 반납했습니다.");
            } catch (NumOverException e) {
                System.out.println("반납 실패: " + e.getMessage());
            }
        } else {
            System.out.println("도서를 찾을 수 없습니다");
        }
    }

    public void addAlarm(String title, int alarm_type, String user_name) {
        Book book = bookMap.get(title);  // 도서 제목을 key로 사용하여 도서 객체를 가져옴

        if (book != null) {
            if (!book.IsAvailable()) {
                book.addAlarm(alarm_type, user_name);
            } else {
                System.out.println("도서는 이미 빌릴수 있는 상태입니다.");
            }
        } else {
            System.out.println("도서를 찾을 수 없습니다");
        }
    }

    public void save(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // 도서 정보 작성
            List<Book> sortedBooks = new ArrayList<>(bookMap.values());
            Collections.sort(sortedBooks, Comparator.comparing(Book::getTitle));

            for (Book book : sortedBooks) {
                writer.write(book.toString() + "\n");
            }
            System.out.println("도서 정보가 성공적으로 CSV 파일에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("도서 정보를 CSV 파일에 저장하는 도중에 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public void load(String filePath) {
        bookMap.clear();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                // TODO: split data를 이용해서 book 객체를 생성하여라.
                Book book = new Book(data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]));
//                Book(title, author, publisher, price, num_book)
                addBook(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("CSV file not found: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
