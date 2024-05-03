package Jpractice;

public class WithoutX2 {
    public static void withoutX2(String str) {
        if (str.length() == 0) {
            System.out.println(str);
            return;
        }

        if (str.length() == 1) {
            if (str.equals("x")) {
                System.out.println("");
            } else {
                System.out.println(str);
            }
            return;
        }

        String result = str.substring(0, 2).replaceAll("x", "") + str.substring(2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        withoutX2("Hexllo");
    }
}

