public class staticPractice {
    private static int a = 0;
    private int b = 0;

    public staticPractice() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        staticPractice adder1 = new staticPractice();
        staticPractice adder2 = new staticPractice();
        staticPractice adder3 = new staticPractice();
        System.out.println("adder1.a: " + adder1.a + ", adder1.b: " + adder1.b);
        System.out.println("adder2.a: " + adder2.a + ", adder2.b: " + adder2.b);
        System.out.println("adder3.a: " + adder3.a + ", adder3.b: " + adder3.b);
    }
}
