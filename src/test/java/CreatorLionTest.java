import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CreatorLionTest {
    private final String sex;
    private final Object expected;

    public CreatorLionTest(String sex, Object expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getManePositive() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"неопределенный пол", "Используйте допустимые значения пола животного - самец или самка"}
        };
    }

    @Test
    public void getManeForLionPositiveData(){
        String exMessage = null;
        try {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(actual, expected);
        } catch (Exception ex) {
            exMessage = ex.getMessage();
            Assert.assertEquals(exMessage, expected);
        }
    }

}
