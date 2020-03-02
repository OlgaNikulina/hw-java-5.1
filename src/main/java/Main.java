public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        boolean unregistered = false;
        long expected = 10;
        long actual = service.calculate(amount, false);
        System.out.println(expected);
    }
}


