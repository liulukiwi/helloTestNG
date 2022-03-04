import org.testng.annotations.Test;

public class TestClass {

    @Test
    void setuop(){
        System.out.println("This is a setup");
    }

    @Test
    void testSteps(){
        System.out.println("This is a testSteps");
    }

    @Test
    void testDown(){
        System.out.println("This is a tearDown");
    }
}
