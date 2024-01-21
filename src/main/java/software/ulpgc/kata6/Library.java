package software.ulpgc.kata6;
import java.util.ArrayList;
public class Library {
    private ArrayList<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(String title){
        books.add(title);
    }
    public String findBook(String title){
        if(books.contains(title)){
            return title;
        }
        return null;
    }
    public void removeBook(String title){
        books.remove(title);
    }
    public boolean containsBook(String title){
        return books.contains(title);
    }
}
