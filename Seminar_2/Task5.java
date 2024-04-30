/** ----------------------------------Задание №5---------------------------------------------
📌 Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
📌 Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
📌 Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл.
 */
import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task5 {
    private static Logger logger = Logger.getLogger(Task5.class.getName());

    public static void main(String[] args) {
        initLogger();
        String[] contentFolder = getContentFolder(".");// текущая папка "."
        writeToFile(contentFolder, "Test2.txt"); // Данные успешно записаны в файл
    }

// Метод №1, который вернет содержимое текущей папки в виде массива строк:
    public static String[] getContentFolder(String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeToFile(String[] contentFolder, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile)) {
            for (String content : contentFolder) {
                fw.write(content);
                fw.write(System.lineSeparator());
            }
            // System.out.println("Данные успешно записаны в файл");
            logger.info("Данные успешно записаны в файл"); // выведет текущую дату и время и соответствующее сообщение
        } catch (Exception e) {
            logger.warning("Ошибка записи в файл!");
            // System.out.println("Ошибка записи в файл!");
        }
    }

// Метод №2, который запишет массив, возвращенный предыдущим методом в файл:
    public static void initLogger() {
        try {
            FileHandler fh = new FileHandler("log.txt", true);//append.true - дает возможность дозаписывать файл
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
        } catch (Exception e) {
            e.printStackTrace();//вся информация по ошибки хранится здесь.
        }
    }
    
}
