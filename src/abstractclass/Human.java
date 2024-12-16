package abstractclass;

import java.util.Scanner;

public class Human extends Player {
    private final static Scanner in = new Scanner(System.in);

    public Human(int number) {
        super(number);
    }

    @Override
    public Decision decide() {
        System.out.println("請選擇要出的拳 (1) 剪刀 (2) 石頭 (3) 布：");
        int num = in.nextInt();

        switch (num) {
            case 1:
                return Decision.SCISSORS;
            case 2:
                return Decision.STONE;
            case 3:
                return Decision.PAPER;
            default:
                System.out.println("只能輸入 1, 2, 3，請重新輸入");
                return decide();
        }
    }
}
