package tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LibraryTest {
    @Test
    public void addBook(){
        Library library = new Library();
        library.addBook("El principito");
        assertTrue(library.containsBook("El principito"));
    }
    @Test
    public void findBook(){
        Library library = new Library();
        library.addBook("1984");
        assertEquals("1984", library.findBook("1984"));
    }
    @Test
    public void removeBook(){
        Library library = new Library();
        library.addBook("1984");
        library.removeBook("1984")
        assertFalse(library.contains("1984"));
    }
}
