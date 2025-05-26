package reviews.reviews2;

public class Reviews19 {
    public static void main(String[] args) {
        int num = 4;
        int sum = 1;
        int factorial = 1;
        while(factorial <= num) {
            sum *= factorial;
            factorial++;
        }
        System.out.println("結果: " + sum);
    }
}
