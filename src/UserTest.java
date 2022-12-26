import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;


    @Before
    public void initTest() {
        user = new User( "@a.","a");
    }

    ;

    @After
    public void afterTest() {
        user = null;
    }

    ;

    @Test
    public void testVoid() throws Exception {
    Assert.assertFalse(user.getEmail().isEmpty());
    Assert.assertFalse(user.getLogin().isEmpty());
    }

    @Test
    public void testEmail() throws Exception {
        Assert.assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    public void testEqual() throws Exception{
        Assert.assertEquals(user.getLogin(),user.getEmail());
    }


}
