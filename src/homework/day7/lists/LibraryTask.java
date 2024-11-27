package homework.day7.lists;

import homework.day7.additionalobjects.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryTask {

    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();

        library.add(new Book("Война и мир", "Толстой"));
        library.add(new Book("Преступление и наказание", "Достоевский"));
        library.add(new Book("Мастер и Маргарита", "Булгаков"));

        for (Book book : library) {
            System.out.print(book.getName() + " ");
        }

        Map<String, String> booksMap = new HashMap<>();

        for (int i = 0; i < library.size(); i++) {
            booksMap.put(library.get(i).getName(), library.get(i).getAuthor());
        }
        System.out.println();

        for (String key : booksMap.keySet()) {
            System.out.println(key);
        }

        for (String value : booksMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> map : booksMap.entrySet()) {
            System.out.println(map);
        }
    }
}
