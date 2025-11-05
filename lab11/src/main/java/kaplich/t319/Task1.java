package kaplich.t319;

import java.io.*;

public class Task1 {
    public static void execute() {
        String fileName = "my_info.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("ФИО: Каплич Виталий Викторович\n");
            writer.write("Возраст: 23 года\n");
            writer.write("Город: Минск\n");
            writer.write("Хобби: программирование, чтение, музыка\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        File file = new File(fileName);
        System.out.println("Информация о файле:");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nСодержимое файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
