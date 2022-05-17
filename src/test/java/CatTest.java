import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
  @Mock
  Feline feline;


  @Test
  public void getSoundReturnsCorrectResult() {
    Cat cat = new Cat(feline);
    String expected = "Мяу";
    String actual = cat.getSound();
    assertEquals(expected, actual);
  }

  @Test
  public void getFoodReturnsCorrectResult() throws Exception {
    Cat cat = new Cat(feline);
    Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    List<String> actual = cat.getFood();
    assertEquals(expected, actual);
  }
}
