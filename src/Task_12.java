/*
     Задание № 12
  Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.

*/

import java.util.Scanner;
public class Task_12 {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String X = scan.nextLine();
        String ws = X.replaceAll("\\s","");
        System.out.println("Введенный вами текст без пробелов: " + ws);
    }
}