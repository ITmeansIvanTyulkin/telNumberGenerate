package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestData {
    private final List<Integer> phones = new ArrayList<>();
    private final Random random = new Random();

    public synchronized void add() {
        phones.add(randPhone());
    }

    public List<Integer> getPhones() {
        return phones;
    }

    private int randPhone() {
        return (int) (89000000000L + random.nextInt(900000000)); // Генерация случайного номера
    }
}