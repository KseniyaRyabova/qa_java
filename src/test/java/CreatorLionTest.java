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

    @Parameterized.Parameters(name = "sex: {0}")
    public static Object[][] getManePositive() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"неопределенный пол", "Используйте допустимые значения пола животного - самец или самка"},
                {null, "Используйте допустимые значения пола животного - самец или самка"}};
    }

    @Test
    public void getManeForLionPositiveData() {
        try {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals("Самка с гривой? Или Самец без? Эти современные львы...", expected, actual);
        } catch (Exception ex) {
            String actual = ex.getMessage();
            Assert.assertEquals("Тут должно было быть исключение", expected, actual);
        }
    }

}
