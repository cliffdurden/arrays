import org.junit.Test;

/**
 * Created by cliff on 2015-01-31.
 */
public class OrdArrayTest {

    @Test
    public void test(){
        OrdArray a = new OrdArray(100);
        a.fillRandom();
        //a.display();
        a.sort();
        //a.display();
        long start1 = System.nanoTime();
        System.out.println("found at index " + a.find(99));
        System.out.println("delta1 = " + (System.nanoTime() - start1));
        long start2  =System.nanoTime();
        System.out.println("found from book at index " + a.find(99));
        System.out.println("delta2 = " + (System.nanoTime() - start2));
    }

    @Test
    public void testCustomSort(){
        OrdArray a = new OrdArray(100);
        //a.fillRandom(42);
        //a.display();
        //a.sort();
        //a.display();
        a.insert(3);
        a.insert(90);
        a.insert(0);
        a.display();
        a.delete(90);
        a.display();
        a.delete(3);
        a.display();
        a.delete(0);
        a.display();
        a.delete(42);
    }
}
