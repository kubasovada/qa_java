import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(Parameterized.class)
public class FelineTest {
//  @Mock
//  Animal animal;

  private final int kittensCount;

  public FelineTest(int kittensCount) {
    this.kittensCount = kittensCount;
  }


  @Test
  public void getFamilyReturnsCorrectValue() {
    Feline feline = new Feline();
    String expected = "Кошачьи";
    String actual = feline.getFamily();
    assertEquals(expected, actual);
  }


  @Parameterized.Parameters
  public static Object[][] getKittensCount() {
    return new Object[][] {
            { 1},
            { 2},
            { 3},
            {10}
    };
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
    //int kittensCount = 0;
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
