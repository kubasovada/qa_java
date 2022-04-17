import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
  @Mock
  Feline feline;

  @Test
  public void getFoodReturnsCorrectResult() throws Exception {
    Lion lion = new Lion(feline, "Самка");
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    List<String> actual = lion.getFood();
    assertEquals(expected, actual);
  }

  @Test
  public void getKittensReturnsCorrectResult() throws Exception {
    Lion lion = new Lion(feline, "Самка");
    Mockito.when(feline.getKittens()).thenReturn(3);
    int expected = 3;
    int actual = lion.getKittens();
    assertEquals(expected, actual);
  }

  @Test
  public void doesHaveManeReturnsTrue() throws Exception {
    Lion lion = new Lion(feline, "Самец");
    boolean actual = lion.doesHaveMane();
    boolean expected = true;
    assertEquals(expected, actual);

  }


}
