package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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