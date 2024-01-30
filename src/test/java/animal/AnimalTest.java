package animal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily());
    }

    @Test
    public void getFoodExceptionMessageTest() {
        String exceptionMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = assertThrows(Exception.class, () -> new Animal().getFood("абракадабра"));
        assertEquals(exceptionMessage, exception.getMessage());
    }
}
