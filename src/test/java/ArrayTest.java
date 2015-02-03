import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * Created by cliff on 2015-01-29.
 */
public class ArrayTest {

    private class Foo {
    }

    @Test
    public void testNotInitialiszed() {
        Foo[] bar = new Foo[100];
        assertNull(bar[42]);
    }

    @Test
    public void testTraditionalProcedureStyleArray() {
        int arr[];
        arr = new int[100];
        int itemsCount;
        int searchItem;
        int itemToDelete;
        arr[0] = 77;
        arr[1] = 74;
        arr[2] = 20;
        arr[3] = 32;
        arr[4] = 91;
        arr[5] = 25;
        arr[6] = 12;
        arr[7] = 42;
        arr[8] = 56;
        arr[9] = 82;
        itemsCount = 10;
        for (int i = 0; i < itemsCount; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        searchItem = 42;
        for (int i = 0; i < itemsCount; i++) {
            if (searchItem == arr[i]) {
                System.out.println("Item " + searchItem + " found at index:" + i);
                break;
            }
            if (i == itemsCount - 1) {
                System.out.println("Search key not found");
            }
        }

        itemToDelete = 56;
        for (int i = 0; i < itemsCount; i++) {
            if (itemToDelete == arr[i]) {
                for (int j = i; j < itemToDelete - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                itemsCount--;
                break;
            }
        }

        for (int i = 0; i < itemsCount; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
