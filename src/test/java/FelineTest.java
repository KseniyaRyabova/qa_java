import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatWhenPredatorThanFishAndAnimalAndBird() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals("Должно быть семейство кошачьих", expected, actual);
    }

    @Test
    public void getKittensFeline() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals("1 потомок за раз - это все на что способны львы", expected, actual);
    }

    @Test
    public void getKittenWhenZeroThanZero() {
        Feline feline = new Feline();
        int expected = 0;
        int actual = feline.getKittens(0);
        Assert.assertEquals("Ожидается, что котят не должно быть", expected, actual);
    }
}
