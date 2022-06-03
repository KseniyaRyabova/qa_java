import com.example.Cat;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;
import java.util.logging.Level;

public class LionTest {

    @Test
    public void getKittensForLion() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens();
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void doesHaveManeWhenTrue() throws Exception {
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }

//    как замокать объект, чтобы не нужно было создавать конструктор,
//    но при этом методы возвращали реальные значения?
//    То есть, например, что бы мок объекта Lion возвращал список своей еды,
//    которая действительно есть по вызову lion.getFood() для объектов этого класса
//    иначе получается зависимый от конструктора тест =(

    @Test
    public void getFoodForLion() throws Exception {
        Lion lion = new Lion("Самка");
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = lion.getFood();
        Assert.assertEquals(actual, expected);
    }
}
