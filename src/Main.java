public class Main {
    public static void main(String[] args) {

        System.out.println(method());
    }

    static int method() {
        int counter = 0;
        for (int i = 1; i <= 300; i++) {

            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                counter = counter + i;
            }
        }
        return counter;
    }
}