import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {
    CharacterCheck temp;
    @Before
    public void setUp() throws Exception {
        temp= new CharacterCheck();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void capitalCheck(){

        String expected="Character is a capital letter";
        String result=temp.main('A');

        assertEquals(expected,result);


    }
    @Test
    public void smallCheck(){

        String expected="Character is a small letter";
        String result=temp.main('a');

        assertEquals(expected,result);


    }
    @Test
    public void numberCheck(){
        String expected="Character is a Number";

        String result=temp.main('2');

        assertEquals(expected,result);
    }
    @Test
    public void specialCheck(){
        String expected="Character is a special symbol";

        String result=temp.main('%');

        assertEquals(expected,result);
    }

}