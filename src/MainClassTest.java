import org.junit.Assert;
import org.junit.Test;
import sun.applet.Main;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("class_number <= 45", getClassNumber() > 45);

    }

    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("Number is not equal 14",getLocalNumber() == 14);
    }

}
