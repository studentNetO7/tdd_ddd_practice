import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd (){
PhoneBook phoneBook = new PhoneBook();
        // Добавляем первый контакт и проверяем, что количество контактов стало 1
        assertEquals(1, phoneBook.add("Olga", "445566112233"));

        // Добавляем второй контакт и проверяем, что количество контактов стало 2
        assertEquals(2, phoneBook.add("Lev", "123456789"));

        // Добавляем третий контакт и проверяем, что количество контактов стало 3
        assertEquals(3, phoneBook.add("Phillip", "555666777"));
    }
}
