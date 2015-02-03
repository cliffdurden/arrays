/**
 * Created by cliff on 2015-01-30.
 */
public class HighArray {

    private int[] arr;
    private int itemCount;

    public HighArray(int maxElements) {
        arr = new int[maxElements];
        itemCount = 0;
    }

    public void insert(final int element) {
        arr[itemCount] = element;
        itemCount++;
    }

    public void display() {
        for (int i = 0; i < itemCount; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void find(final int searchElement) {
        for (int i = 0; i < itemCount; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }

    public void delete(final int elementToDelete) {
        for (int i = 0; i < itemCount; i++) {
            if (arr[i] == elementToDelete) {
                for (int j = i; j < itemCount - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                itemCount--;
            }
        }
    }


}
