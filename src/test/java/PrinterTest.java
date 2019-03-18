import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 300);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getPaperAmount());
    }

    @Test
    public void hasToner() {
        assertEquals(300, printer.getTonerVolume());
    }

    @Test
    public void printCopies() {
        printer.printCopies(2,5);
        assertEquals(90, printer.getPaperAmount());
        assertEquals(290, printer.getTonerVolume());
        printer.printCopies(10,10);
        assertEquals(90, printer.getPaperAmount());
        assertEquals(290, printer.getTonerVolume());
    }

    @Test
    public void fillPaper() {
        printer.printCopies(4,5);
        printer.fillPaper();
        assertEquals(100, printer.getPaperAmount());
    }


}
