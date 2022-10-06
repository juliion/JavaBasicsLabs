public class MatrixCalculator {

    public Matrix MultiplyMatrices(Matrix A, Matrix B)  {
        if(A.getRows() != B.getCols()) {
            throw new IllegalArgumentException("The number of columns of the first matrix must be equal to the number of rows of the second matrix.");
        }
        Matrix multiply = new Matrix(A.getRows(), B.getCols());
        for (int i = 0; i < A.getRows(); i++)
        {
            for (int j = 0; j < B.getCols(); j++)
            {
                multiply.getArray()[i][j] = 0;
                for (int k = 0; k < A.getCols(); k++)
                {
                    multiply.getArray()[i][j] += A.getArray()[i][k] * B.getArray()[k][j];
                }
            }
        }
        return multiply;
    }

    public float SumOfLargestElements(Matrix matrix) {
        float sum = 0;
        for (int i = 0; i < matrix.getCols(); i++)
        {
            if(i % 2 != 0) {
                sum += CalcMax(matrix.getColumnByInd(i));
            }
        }
        return sum;
    }

    public float SumOfSmallestElements(Matrix matrix) {
        float sum = 0;
        for (int i = 0; i < matrix.getCols(); i++) {
            if(i % 2 == 0) {
                sum += CalcMin(matrix.getColumnByInd(i));
            }
        }
        return sum;
    }

    private float CalcMax(float[] array) {
        float max = array[0];
        for(int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        return max;
    }

    private float CalcMin(float[] array) {
        float min = array[0];
        for(int i = 0; i < array.length; i++) {
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }
}
