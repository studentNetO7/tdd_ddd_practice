import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    // Подготовка данных перед каждым тестом
    @Before
    public void setUp() {
        phoneBook = new PhoneBook();  // Создаем новый объект перед каждым тестом
        phoneBook.add("Olga", "445566112233");
        phoneBook.add("Lev", "123456789");
        phoneBook.add("Phillip", "555666777");
    }

    @Test
    public void testAdd() {
        // Добавляем контакт и проверяем, что количество контактов стало 4
        assertEquals(4, phoneBook.add("Anna", "987654321"));
    }

    @Test
    public void testFindByNumber() {
        // Проверяем случаи когда номера записаны в телефонную книгу
        assertEquals("Olga", phoneBook.findByNumber("445566112233"));
        assertEquals("Lev", phoneBook.findByNumber("123456789"));
        assertEquals("Phillip", phoneBook.findByNumber("555666777"));
        // Проверяем случай когда номер не записан в телефонную книгу
        assertNull(phoneBook.findByNumber("000000000000"));
    }

    @Test
    public void testFindByName() {
        // Проверяем случаи когда номера записаны в телефонную книгу
        assertEquals("445566112233", phoneBook.findByName("Olga"));
        assertEquals("123456789", phoneBook.findByName("Lev"));
        assertEquals("555666777", phoneBook.findByName("Phillip"));
        // Проверяем случай когда номер не записан в телефонную книгу
        assertNull(phoneBook.findByName("Petya"));
    }

    @Test
    public void testPrintAllNames() {
        // Получаем строку, которая должна быть выведена
        String result = phoneBook.printAllNames();

        // Ожидаемый вывод в алфавитном порядке
        String expectedOutput = "Lev\nOlga\nPhillip\n";

        // Проверяем, что результат совпадает с ожидаемым
        assertEquals(expectedOutput, result);
    }
}
