import org.junit.Assert;
import org.testng.annotations.Test;

public class TestListenerPracticeTest{

    @Test
    public void TestToPass(){
        Assert.assertTrue(true);
    }

    @Test
    public void TestToFail(){
        Assert.assertTrue(false);
    }
}
