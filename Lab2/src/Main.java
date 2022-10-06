public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix(3, 5);
        Matrix B = new Matrix(5, 3);

        MatrixCalculator matrixCalculator = new MatrixCalculator();

        System.out.println("Matrix A:");
        System.out.println(A);
        System.out.println("Matrix B:");
        System.out.println(B);
        System.out.println("Matrix A x B:");

        try {
            Matrix C = matrixCalculator.MultiplyMatrices(A, B);
            System.out.println(C);
            float sumOfLargestElem = matrixCalculator.SumOfLargestElements(C);
            float sumOfSmallestElem = matrixCalculator.SumOfSmallestElements(C);
            System.out.println("Sum of the largest elements in the matrix " +
                    "columns with odd numbers:  " + sumOfLargestElem);
            System.out.println("Sum of the smallest elements in the" +
                    " even-numbered columns of the matrix:  " + sumOfSmallestElem);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}