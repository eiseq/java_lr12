package kaplich.t319;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void execute() {
        String fileName = "temperatures.txt";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("\nВвод тепературы:");

            for (int i = 1; i <= 15; i++) {
                while (true) {
                    System.out.print("Введите температуру " + i + ": ");
                    try {
                        double temperature = scanner.nextDouble();
                        writer.write(temperature + "\n");
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.err.println("Ошибка: введите вещественное число!");
                        scanner.next();
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nРасчёт средней температуры:");
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    double temp = Double.parseDouble(line.trim());
                    System.out.println("Температура " + (count + 1) + ": " + temp);
                    sum += temp;
                    count++;
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка формата: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Средняя температура: %.2f°C\n", average);
        }
    }
}
