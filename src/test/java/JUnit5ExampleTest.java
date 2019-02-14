import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnit5ExampleTest {

    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
        System.out.println("");
        System.out.println("First step");
        Assertions.assertEquals(4, 4, "Thats fine - test ok");
        System.out.println("Second step");
        Assertions.assertEquals(4, 3,"3 is different of 4 - test failed");
    }
}