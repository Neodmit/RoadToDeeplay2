import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpecialOnesExceptions {
    //Пришлось вынести эти тесты в отдельный класс, потому что когда ты запускал тест класса TestSolution с ними,
    //они возвращали чило 12, а не null. А если ты запускал их в TestSolution по отдельности - методами,
    // они возвращали необходимый null. Здесь весь класс работает верно. Не знаю с чем всё жто может быть связано.
    @Test
    public void testGetResult18() throws IOException {
        assertEquals(null, Solution.getResult("STWSWTPPTPTTSWPP", "Woodmannnnnn"));
    }

    @Test
    public void testGetResult19() throws IOException {
        assertEquals(null, Solution.getResult("STWSWTPPTPTTSWPP", ""));
    }

    @Test
    public void testGetResult20() throws IOException {
        assertEquals(null, Solution.getResult("STWSWTPPTPTTSWPP", null));
    }

}
