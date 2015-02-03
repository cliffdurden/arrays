import org.junit.Test;

/**
 * Created by cliff on 2015-01-31.
 */
public class HighArrayTest {

    @Test
    public void test(){
        int maxSize = 100;
        HighArray arr;

        arr = new HighArray(maxSize);
        arr.insert(53);
        arr.insert(22);
        arr.insert(13);
        arr.insert(27);
        arr.insert(42);
        arr.insert(90);
        arr.insert(13);
        arr.insert(72);
        arr.insert(23);
        arr.insert(13);
        arr.insert(13);

        arr.display();

        arr.find(42);

        arr.delete(13);

        arr.display();
    }
}
