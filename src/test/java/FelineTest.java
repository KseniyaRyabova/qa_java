import com.example.Animal;
import com.example.Feline;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

public class FelineTest {

    @Test
    public void getMeatWhenPredatorThanFishAndAnimalAndBird() throws Exception {
        Feline feline = new Feline();
        String predator = "Хищник";
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.getFood(predator);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatMeatWhenPredatorThanFishAndAnimalAndBird() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getKittensFeline() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getKittenWhenZeroThanZero() {
        Feline feline = new Feline();
        int expected = 0;
        int actual = feline.getKittens(0);
        Assert.assertEquals(actual, expected);
    }
}
