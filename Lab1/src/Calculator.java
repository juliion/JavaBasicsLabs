public class Calculator {
    FormulaParams formulaParams;
    public Calculator(FormulaParams formulaParams) {
        this.formulaParams = formulaParams;
    }

    public double Calculate() {
        double sum = 0;
        for (double i = formulaParams.a; i <= formulaParams.n; i++)
        {
            for (double j = formulaParams.b; j <= formulaParams.m; j++)
            {
                if(i - formulaParams.C == 0)
                    throw new ArithmeticException("Division by zero");
                sum += (i - j) / (i - formulaParams.C);
            }
        }
        return sum;
    }
}
