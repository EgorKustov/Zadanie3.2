public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int index;
        index = (int) service.calculate(weight, height);
        System.out.println(index);
    }
}