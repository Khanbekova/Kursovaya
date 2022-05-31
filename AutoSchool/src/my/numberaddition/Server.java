/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.numberaddition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Елена
 */
public class Server {

    public static int CountLinesInFile(String filename) throws IOException {
        // 1. Объявить внутренние переменные
        int count = 0; // количество строк в файле - результат
        FileReader fr = null;
        int symbol;

        try {
            // 2. Попытка открыть файл для чтения
            fr = new FileReader(filename);

            // Цикл чтения символов из файла и подсчета их количества
            do {
                // Считать символ из файла
                symbol = fr.read();

                // Проверить, есть ли символ конца строки
                if ((char) symbol == '\n') {
                    count++; // Увеличить количество строк в файле на 1
                }
            } while (fr.ready()); // Проверка на конец файла
        } catch (IOException e) {
            // 3. Если файл не открыт, то вывести соответствующее сообщение
            System.out.println("I/O error: " + e);
        } finally {

            // 4. Закрыть файл, если он был открыт
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("File close error.");
            }
        }

        // 5. Вернуть результат
        return count;
    }

    public static String[] GetLinesFromFile(String filename) throws IOException {
        // 1. Объявить внутренние переменные
        int count; // количество строк в файле
        String lines[] = null; // массив строк - результат
        FileReader fr = null;
        String s; // дополнительная переменная - строка
        int symbol;
        int i;

        // 2. Получить кооличество строк в файле - вызвать функцию CountLinesInFile()
        count = CountLinesInFile(filename);

        // 3. Проверка, есть ли в файле строки
        if (count <= 0) {
            return null;
        }

        // 4. Выделить память для count строк
        lines = new String[count];

        // 5. Чтение данных из файла и создание массива lines[]
        try {
            // 5.1. Попытка открыть файл для чтения
            fr = new FileReader(filename);

            // 5.2. Цикл чтения символов из файла и создание массива lines
            s = "";
            i = 0;
            do {
                // Считать символ из файла
                symbol = fr.read();

                // Проверить на символ конца строки
                if (((char) symbol == '\n')) {
                    // удалить из s символ '\n'
                    s = s.substring(0, s.length() - 1);

                    // Добавить в массив строк строку s
                    lines[i] = s;
                    s = "";
                    i++; // Увеличить количество строк в файле на 1
                } else {
                    // добавить символ к строке
                    s = s + (char) symbol;
                }
            } while (fr.ready()); // Проверка на конец файла
        } catch (IOException e) {
            // 5.3. Если файл не открыт, то вывести соответствующее сообщение
            System.out.println("I/O error: " + e);
        } finally {
            // 5.4. Закрыть файл, если он был открыт
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("File close error.");
            }
        }

        // 6. Вернуть результат
        return lines;
    }

    public static void WriteLinesToFile(String lines[], String filename) throws IOException {

        // 1. Объявить внутренние переменные
        FileOutputStream fs = null;
        PrintStream ps = null;

        try {
            // 2. Создать экземпляры классов FileOutputStream, PrintStream
            fs = new FileOutputStream(filename); // создать файловый поток
            ps = new PrintStream(fs); // связать файловый поток с потоком вывода PrintStream

            // 3. Цикл записи массива lines[] в файл
            for (int i = 0; i < lines.length; i++) {
                ps.println(lines[i]);
            }
        } catch (IOException e) {
            // Если ошибка открытия файла или другая ошибка
            System.out.println("I/O error: " + e);
        } finally {
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e2) {
                    System.out.println("Error closing " + filename);
                }
            }

            if (ps != null) {
                ps.close();
            }
        }
    }

    public static boolean ReplaceStringInFile(int position, String str, String str1,String filename)
            throws IOException {

        // 1. Выполнить необходимые проверки
        // Корректно ли значение position?
        int count = CountLinesInFile(filename); // количество строк в файле
        if ((position < 0) || (position >= count)) {
            return false;
        }

        // 2. Получить список строк файла
        String lines[] = GetLinesFromFile(filename);

        // 3. Заменить строку в позиции position
        if (str1.equals("."))
            lines[position] = lines[position].replace("свободно", str);
        if (str1.equals("свободно"))
            lines[position] = lines[position].replace(str, "свободно");

        // 4. Записать измененный список строк обратно в файл
        WriteLinesToFile(lines, filename);

        return true;
    }

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8000)) {
            System.out.println("Сервер запущен");

            while (true) {
                Socket socket = server.accept();
                try (
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    String result;
                    String[] values;

                    String request = reader.readLine();
                    values = request.split(" ");

                    System.out.println("Запрос:" + values[0] + values[1] + values[2]+ values[3]);
                    int position;
                    position = Integer.valueOf(values[0]);

                    boolean res;
                    res = ReplaceStringInFile(position, values[1], values[2],values[3] );

                    if (res) {
                        result = "Загружено";
                    } else {
                        result = "Fail";
                    }

                    

                    System.out.println("Ответ:" + result);

                    writer.write(result);
                    writer.newLine();
                    writer.flush();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
