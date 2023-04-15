import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Collections;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals("Кошка не то чем кажется", expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodList);
        List<String> expected = expectedFoodList;
        List<String> actual = cat.getFood();
        assertEquals("Животное не любит это", expected, actual);
    }

}