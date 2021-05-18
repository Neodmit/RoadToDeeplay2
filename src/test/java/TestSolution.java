import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {

    @Test
    public void testGetResult1() throws IOException {
        assertEquals(10, Solution.getResult("STWSWTPPTPTTPWPP", "Human"));
    }

    @Test
    public void testGetResult2() throws IOException {
        assertEquals(10, Solution.getResult("STWSWTPPTSTTPWPP", "Human"));
    }

    @Test
    public void testGetResult3() throws IOException {
        assertEquals(10, Solution.getResult("STWSWTPPTPTTSWPP", "Human"));
    }

    @Test
    public void testGetResult4() throws IOException {
        assertEquals(7, Solution.getResult("SPPSSSPSSPWSWPPP", "Human"));
    }

    @Test
    public void testGetResult5() throws IOException {
        assertEquals(10, Solution.getResult("SPSSSSSSPSSSPPPP", "Human"));
    }

    @Test
    public void testGetResult6() throws IOException {
        assertEquals(15, Solution.getResult("STWSWTPPTPTTPWPP", "Swamper"));
    }

    @Test
    public void testGetResult7() throws IOException {
        assertEquals(15, Solution.getResult("STWSWTPPTSTTPWPP", "Swamper"));
    }

    @Test
    public void testGetResult8() throws IOException {
        assertEquals(12, Solution.getResult("TTTTWWTTTWWTTTWW", "Swamper"));
    }

    @Test
    public void testGetResult9() throws IOException {
        assertEquals(12, Solution.getResult("SPPSSSPSSPWSWPPP", "Swamper"));
    }

    @Test
    public void testGetResult10() throws IOException {
        assertEquals(30, Solution.getResult("TTTTTTTTTTTTTTTT", "Swamper"));
    }

    @Test
    public void testGetResult11() throws IOException {
        assertEquals(18, Solution.getResult("SWSWWSWSSSSSWWWW", "Woodman"));
    }

    @Test
    public void testGetResult12() throws IOException {
        assertEquals(12, Solution.getResult("TPTPPTPTTTTTPPPP", "Woodman"));
    }

    @Test
    public void testGetResult13() throws IOException {
        assertEquals(12, Solution.getResult("STWSWTPPTPTTSWPP", "Woodman"));
    }

    @Test
    public void testGetResult14() throws IOException {
        assertEquals(null, Solution.getResult("STWSWTPP", "Woodman"));
    }

    @Test
    public void testGetResult15() throws IOException {
        assertEquals(null, Solution.getResult("фывапролдйцукенг", "Woodman"));
    }

    @Test
    public void testGetResult16() throws IOException {
        assertEquals(null, Solution.getResult("", "Woodman"));
    }

    @Test
    public void testGetResult17() throws IOException {
        assertEquals(null, Solution.getResult(null, "Woodman"));
    }
}
