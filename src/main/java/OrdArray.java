import java.util.Arrays;
import java.util.Random;

/**
 * Created by cliff on 2015-01-31.
 */
public class OrdArray {

    private int[] a;
    private int nElements;

    public OrdArray(int maxSize) {
        a = new int[maxSize];
        nElements = 0;
    }

    public void fillRandom() {
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(1000000);
        }
        nElements = a.length;
    }

    public void fillRandom(int nElements) {
        for (int i = 0; i < nElements - 1; i++) {
            a[i] = new Random().nextInt(1000000);
        }
        this.nElements = nElements;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(i + ":=" + a[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        Arrays.sort(a);
    }

    public void insert(int element) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (a[i] > element) {
                break;
            }
        }
        for (int j = nElements; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = element;
        nElements++;

    }

    public int size() {
        return nElements;
    }

    public void delete(int element) {
        int indx = find(element);
        if (indx != nElements) {
            for (int j = indx; j < nElements - 1; j++) {
                a[j] = a[j + 1];
            }
            nElements--;
        }
    }

    public int find(int element) {
        int lowerBound = 0;
        int upperBound = nElements;
        while (true) {
            int currIn = (lowerBound + upperBound) / 2;
            if (a[currIn] == element) {
                return currIn;
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (a[currIn] < element) {
                    lowerBound = currIn + 1;
                } else {
                    upperBound = currIn - 1;
                }
            }
        }
    }
}
