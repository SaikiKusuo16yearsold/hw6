public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i -= 1) {
            System.out.println(i);
        }

        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                }


            } else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            }
        }


        for (int i = 7; i <= 98; i += 4) {
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        float savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = savings * 1.01f;
            savings = savings + 29000;
            System.out.println("Mесяц " + i + " , сумма накоплений равна " + savings + " рублей");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + "*" + i + "=" + i * 2);
        }

    }
}