import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Sem2
{

    public static void main(String[] args) {

    // StringBuilder builder = new StringBuilder();
    //     String str = "";

    // long begin = System.currentTimeMillis();
    // for (int i = 0; i < 20000; i++) {
    //     str += Character.getName(i);
    // }

    // long end = System.currentTimeMillis();
    // System.out.println(end - begin);

    // begin = System.currentTimeMillis();
    // for (int i = 0; i < 20000; i++) {
    //     builder.append(Character.getName(i));
    // }
    // end = System.currentTimeMillis();
    // System.out.println(end - begin);



    Scanner scanner = new Scanner(System.in);
    // System.out.print("write: ");
    // String text = scanner.nextLine();
    // System.out.println(text);

    // System.out.print("строка1: ");
    // String first = scanner.nextLine();
    // System.out.print("строка2: ");
    // String second = scanner.nextLine();
    

    // if(first.contains(second))
    // {
    //     System.out.println("mach");
    // }
    // else
    // {
    //     System.out.println("not mach");
    // } 
    // ИЛИ

    System.out.println("Введи 1-ю строку: ");
    StringBuilder lineOne = new StringBuilder(scanner.nextLine());

    System.out.println("Введи 2-ю строку: ");
    StringBuilder lineTwo = new StringBuilder(scanner.nextLine());

    // if (lineOne.toString().contains(lineTwo.toString())) {
    //     System.out.println("Содержит");
    // }


    if (lineOne.toString().contains(lineTwo.toString())) {
        int startIndex = lineOne.indexOf(lineTwo.toString());
        int endIndex = startIndex + lineTwo.length();
        System.out.println(startIndex);
        System.out.println(endIndex);
        System.out.println(lineOne.replace(startIndex, endIndex, "Good code!"));
        
        } else System.out.println("Подстрока не найдена");
}
}    