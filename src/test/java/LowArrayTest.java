import org.junit.Test;

/**
 * Created by cliff on 2015-01-30.
 */
public class LowArrayTest {

    @Test
    public void testLowArray() {
        LowArray lowArr;
        int itemCount;
        int searchElement;

        lowArr = new LowArray(100);
        lowArr.setElement(0, 34);
        lowArr.setElement(1, 27);
        lowArr.setElement(2, 64);
        lowArr.setElement(3, 84);
        lowArr.setElement(4, 45);
        lowArr.setElement(5, 23);
        lowArr.setElement(6, 98);
        lowArr.setElement(8, 11);
        lowArr.setElement(9, 30);

        itemCount = 10;

        //print array
        for (int i = 0; i < itemCount; i++) {
            System.out.print(lowArr.getElement(i) + " ");
        }
        System.out.println();

        // search element
        searchElement = 42;
        for (int i = 0; i < itemCount; i++) {
            if (lowArr.getElement(i) == searchElement) {
                System.out.println("element found at index: " + i);
                break;
            }
            if (i == itemCount - 1) {
                System.out.println("can not found element " + searchElement);
            }
        }

        //delete element
        searchElement = 34;
        for (int i = 0; i < itemCount; i++) {
            if (lowArr.getElement(i) == searchElement) {
                for (int j = i; j < itemCount - 1; j++) {
                    lowArr.setElement(j, lowArr.getElement(j + 1));
                }
                itemCount--;
                break;
            }
        }

        //print array
        for (int i = 0; i < itemCount; i++) {
            System.out.print(lowArr.getElement(i) + " ");
        }
    }
}
