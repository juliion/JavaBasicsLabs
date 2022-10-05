public class Main {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int m = 3;
        int b = 1;

        FormulaParams params = new FormulaParams(m, n, a, b);
        Calculator calculator = new Calculator(params);
        try {
            double sum = calculator.Calculate();
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}