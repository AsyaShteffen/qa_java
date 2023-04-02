import com.example.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Не то семейство", expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Ожидаем другое количество котят", expected, actual);
    }

    //добавила проверку метода getKittens(n)
    @Test
    public void getKittensCountTest() {
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(5);
        assertEquals("Ожидаем другое количество котят", expected, actual);
    }

    //проверка метода eatMeat
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Животное такое не ест", expected, actual);
    }

}