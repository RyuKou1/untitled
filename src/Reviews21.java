public class Reviews21 {
    public static void main(String[] args) {
        int num = 4;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("結果: " + sum);
    }
}
