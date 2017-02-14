
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static org.testng.Assert.*;

public class HelloNameTests {

    @DataProvider(name="names")
    public Object[][] names() {
        return new Object[][] {
                {"Steven"},
                {"Steve"},
                {"Stefan"},
                {"Stephanie"}
        };
    }

    /*@Test(dataProvider = "names")
    public void appGreetsByListOfNames(String name) {
        ListOfNames classUnderTest = new ListOfNames();
        assertEquals(classUnderTest.askUserForNames(name);, "Hello "+name, "app should greet by name");
    }*/

    @Test(dataProvider = "names")
    public void whetherGreetedNameIsTheOneWeHaveGiven() {
        // given
        ListOfNames a = new ListOfNames();
        System.setIn(new ByteArrayInputStream("Name".getBytes()));

        // when
        String nameWeGave = a.askUserForName();

        // then
        assertEquals(nameWeGave, "Name");
    }

}

