package kaplich.t319;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static void execute() {
        String fileName = "numbers.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            String[] numbers = {"14.5", "-3.2", "10", "0", "5.61", "-12.8", "77.1", "-3.14", "-1.23", "0.41"};
            for (String number : numbers) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка создания файла: " + e.getMessage());
            return;
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        boolean hasValidNumbers = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nПоиск минимального и максимального элемента");
            String line;
            int lineNum = 0;

            while ((line = reader.readLine()) != null) {
                lineNum++;
                try {
                    double number = Double.parseDouble(line.trim());
                    System.out.println("Число " + lineNum + ": " + number);

                    if (number < min) min = number;
                    if (number > max) max = number;
                    hasValidNumbers = true;

                } catch (NumberFormatException e) {
                    System.err.println("Ошибка в строке " + lineNum + ": '" + line + "' - не число");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (hasValidNumbers) {
            System.out.println("\nРезультаты:");
            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        } else {
            System.out.println("В файле нет корректных чисел!");
        }
    }
}
