import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

  @Mock
  Animal animal;


  @Test
  public void getFamilyReturnsCorrectValue() {
    Feline feline = new Feline();
    String expected = "Кошачьи";
    String actual = feline.getFamily();
    assertEquals(expected, actual);
  }

  @Test
  public void getKittensReturnCorrectValue() {
    Feline feline = new Feline();
    int expected = 1;
    int actual = feline.getKittens();
    assertEquals(expected, actual);
  }

  @Test
  public void getKittensWithCountReturnCorrectValue() {
    Feline feline = new Feline();
    int kittensCount = 1;
    int expected = kittensCount;
    int actual = feline.getKittens(kittensCount);
    assertEquals(expected, actual);
  }

//  @Test
//  public void eatMeatReturnsCorrectValue() throws Exception {
//    Feline feline = new Feline();
//    Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
//    List<String> expected = List.of("Животные", "Птицы", "Рыба");
//    List<String> actual = feline.eatMeat();
//    assertEquals(expected, actual);
//  }


}
