package OopProject1.polymorphism;

public class Cost {
    public int price(int a, int b) {
        int amount = a + b;
        return amount;
    }

    public int price(int a, int b, int c) {
        int amount = a + b + c;
        return amount;
    }

    public int price(int a, int b, int c,int d) {
        int amount = a + b + c+d;
        return amount;
    }
}

