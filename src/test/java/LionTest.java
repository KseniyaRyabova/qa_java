import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensForLion() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void doesHaveManeWhenTrue() throws Exception {
        Lion lion = new Lion("Самец");
        boolean actual = lion.doesHaveMane();
        System.out.println(actual);
        boolean expected = false;
        Assert.assertEquals("Самец без гривы? Не может быть.", expected, actual);
    }



    @Test
    public void getFoodForLion() throws Exception {
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        Assert.assertEquals("Рацион не совпадает с ожидаемым: животные, птицы, рыбы", expected, actual);
    }
}
