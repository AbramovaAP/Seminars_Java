/*=======================Задание №9 (доп)==========================
 Записать в файл следующие данные:
 Name Surname Age
 Kate Smith 20
 Paul Green 25
 Mike Black 23
 */

import java.io.FileWriter;
import java.io.IOException;

public class Task9_dop {
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("Date_Task9_dop.txt", false))
        {
           // запись всей строки
            String text = "Name Surname Age";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            //Дозапись в файл
            writer.append("Kate Smith 20");
            writer.append('\n');
            writer.append("Paul Green 25");
            writer.append('\n');
            writer.append("Mike Black 23");
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}
