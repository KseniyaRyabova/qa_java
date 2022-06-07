import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void getKittensForLion() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void doesHaveManeWhenTrue() throws Exception {
        /* как мне тут не пользоваться конструктором,
        если я никак не могу инициализировать переменную hasMane класса Lion извне,
        то есть, что делать, если нет метода, который я могу замокать?
        Или в данном контексте нормальная ситуация,
        что я проверяю инициализацию переменной через конструктор и мокать ничего не нужно?*/
        Lion lion = new Lion("Самец");
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        Assert.assertEquals("Самец без гривы? Не может быть.", expected, actual);
    }

    @Mock
    Feline feline;

    @Test
    public void getFoodForLion() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood("Хищник");
        Assert.assertEquals("Рацион не совпадает с ожидаемым: животные, птицы, рыбы", expected, actual);
    }
}
