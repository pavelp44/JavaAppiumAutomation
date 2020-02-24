import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainTest{

    @Test

    public void testGetLocalNumber(){
        Assert.assertTrue("Number is not equal 14",getLocalNumber() == 14);
    }

}
