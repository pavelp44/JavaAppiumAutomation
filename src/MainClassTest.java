import org.junit.Assert;
import org.junit.Test;
import sun.applet.Main;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString(){
        Assert.assertTrue("Failed to find substring in class_string", (getClassString().contains("Hello")) || getClassString().contains("hello"));
    }

}
