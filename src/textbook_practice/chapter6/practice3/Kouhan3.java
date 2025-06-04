package textbook_practice.chapter6.practice3;

import static java.lang.Thread.sleep;

public class Kouhan3 {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい。");
    }
    public static void showMondokoro() throws InterruptedException {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        sleep(3000);
        Zenhan3.doTogame();
    }
}
