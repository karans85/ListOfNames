import org.testng.annotations.DataProvider;

import java.io.ByteArrayInputStream;

import static org.testng.Assert.assertEquals;

/**
 * Created by Karanjit_Singh on 14-02-2017.
 */
public class Test {

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

    @org.testng.annotations.Test(dataProvider = "names")
    public void whetherGreetedNameIsTheOneWeHaveGiven(String expectedName) {
        // given
        ListOfNames a = new ListOfNames();
        System.setIn(new ByteArrayInputStream(expectedName.getBytes()));

        // when
        String nameWeGave = a.askUserForName();

        // then
        assertEquals(nameWeGave, expectedName);
    }

}
