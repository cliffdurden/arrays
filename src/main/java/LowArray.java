/**
 * Created by cliff on 2015-01-30.
 */
public class LowArray {

    private int[] arr;

    public LowArray(int size) {
        arr = new int[size];
    }

    public int getElement(int index) {
        return arr[index];
    }

    public void setElement(final int index, final int value) {
        arr[index] = value;
    }
}
