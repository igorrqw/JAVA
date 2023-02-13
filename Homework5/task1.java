// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что один человек может иметь несколько телефонов.

package Homework5;

import java.util.HashMap;
import java.util.Map;
public class task1 {
    public static void main(String[] args) {

        Map<String, String> bookFone = new HashMap<>();    
        bookFone.put("Иванов И.И.", "89283215434");
        bookFone.put("Сковроцов К.А.", "89181234321");
        bookFone.put("Синицын Ю.Ю.", "89239786776");
        bookFone.put("Петров К.А.", "89766543234");
        bookFone.put("Ковалев С.С.", "87855643423, 89453456534");
        bookFone.put("Васильев А.А.", "89345335455, 89345234354");
        System.out.println(bookFone.get("Иванов И.И."));
        System.out.println(bookFone.get("Васильев А.А."));

        addBookFone(bookFone, "Пушкин Б.Е.", "89284342132");

        System.out.println(bookFone.get("Пушкин Б.Е."));

        deleteBookFone(bookFone, "Сковроцов К.А.");

        System.out.println(bookFone);
    }

    // Добавить или изменить данные
    private static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    private static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }
}