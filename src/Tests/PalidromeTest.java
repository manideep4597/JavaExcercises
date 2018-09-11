import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalidromeTest {
      Palidrome temp;

    @Before
    public void setUp() throws Exception {
        temp = new Palidrome();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }
    @Test

    public void palidromeSumNegetive(){

        String expected="121 is a Pallidrome and sum of the even numbers is less than 25";
        String result=temp.main(121);

        assertEquals(expected,result);


    }
    @Test
    public void palidromeSumPositive(){

        String expected="2468642 is a Pallidrome and sum of the even numbers is greater than 25";
        String result=temp.main(2468642);

        assertEquals(expected,result);


    }
    @Test
    public void falsePalidrome(){
        String expected="33221 is a not a Pallidrome";

        String result=temp.main(33221);

        assertEquals(expected,result);


    }
}