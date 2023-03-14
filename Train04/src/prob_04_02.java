public class prob_04_02 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000; i+=1){
            if(((double)i%2 != 0)&&((double)i%7 != 0)) {
//                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum is %d\n", sum);
    }
}
