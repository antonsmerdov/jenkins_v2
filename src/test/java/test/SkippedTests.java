package test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("properties")
public class SkippedTests {
    @Disabled
    @Test
    void test01() {
        assertTrue(true);
    }

    @Disabled("With some reason")
    @Test
    void test02() {
        assertTrue(true);
    }


    @Test
    void someTest() {
        String browser = System.getProperty("browser" , "opera");
        System.out.println(browser);
    }


}
