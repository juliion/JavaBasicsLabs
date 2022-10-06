import java.util.Arrays;
import static java.lang.Math.*;

public class Matrix {
    private int rows;
    private int cols;
    private float[][] array;

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public float[][] getArray() {
        return array;
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        array = new float[rows][cols];
        FillRandom();
    }
    public float[] getColumnByInd(int ind) {
        float[] column = new float[rows];
        for (int i = 0; i < rows; i++)
        {
            column[i] = array[i][ind];
        }
        return column;
    }
    private void FillRandom() {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                array[i][j] = (float) (1 + random() * 9);
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                str += array[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}
