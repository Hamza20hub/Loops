package OopProject1.polymorphism;

public class CostTotal extends Cost {
    public class Cost {
        public int price(int a, int b) {
            int amount = a+ b + 5;
            return amount;
        }
        public int price(int a, int b,int c) {
            int amount = a + b + c+ 3;
            return amount;
        }

        public int price(int a, int b,int c, int d) {
            int amount = a + b + c+ d+ 4;
            return amount;
        }

    }

}