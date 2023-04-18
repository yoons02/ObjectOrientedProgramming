import java.io.IOException;
interface Sort {

    // todo: ascending  descending 함수 정의
    public void ascending(int[] arr);
    public void descending(int[] arr);

    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}

class HeapSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("HeapSort 입니다.");
    }
}


class QuickSort implements Sort{

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}

class BubbleSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort 입니다.");
    }
}

public class EX12_SortMain {
    public static void main(String[] args) throws IOException{
        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("B : BubbleSort ");
        System.out.println("H : HeapSort ");
        System.out.println("Q : QuickSort ");

        int ch = System.in.read();
        Sort sort = null;

        //--------------Your Code-----------------------
        if (ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        } else if (ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        } else if (ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        } else {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        //-----------------------------------------------
        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();

    }
}
