package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Код генерирует случайные телефонные номера и добавляет их в массив `phones` в структуре `testData`.
Каждый телефонный номер начинается с "890", и затем добавляются случайные 9 цифр, чтобы получить полный номер.
Основная функция `generate` запускает несколько потоков, каждый из которых добавляет случайный номер в `testData`.

Этот код можно использовать для тестирования систем, которые требуют случайные телефонные номера, например,
для создания тестовых данных в приложениях, работающих с контактами или пользователями.
 */

public class Main {
    public static void main(String[] args) {
        TestData td = new TestData();
        generate(100, td);
        System.out.println(td.getPhones().size());
    }

    public static void generate(int n, TestData td) {
        ExecutorService executor = Executors.newFixedThreadPool(10); // Пул потоков для обработки
        for (int i = 0; i < n; i++) {
            executor.execute(td::add);
        }
        executor.shutdown(); // Завершить работу пула потоков
        while (!executor.isTerminated()) {
            // Ожидание завершения всех потоков
        }
    }
}