package OopProject1.polymorphism;


public class Executor {
    public static void main(String[] args) {
        Cost cost = new Cost();
        int amount = cost.price(10, 20);
        int amount1 = cost.price(20, 30, 60);
        System.out.println(amount);
        System.out.println(amount1);

        CostTotal ct = new CostTotal();
       int amount5= ct.price(2,4,5);
        System.out.println(amount5);
    }

}
