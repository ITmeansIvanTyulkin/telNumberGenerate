package maintest;

import jdk.jfr.Description;
import main.TestData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    @Tag("API test")
    @DisplayName("Тест на проверку успешного создания телефонных номеров..")
    @Description("Проверка, что произошло успешная генерация номеров..")
    public void testAddPhone() {
        TestData td = new TestData();
        td.add();
        List<Integer> phones = td.getPhones();
        assertEquals(1, phones.size());
    }
}