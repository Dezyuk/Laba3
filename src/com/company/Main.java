package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //task6();
        //task17();
        //task40();
        task61();
    }

    /**
     * 6. Дан символ C, изображающий цифру или букву (латинскую или кириллическую).
     * Если C изображает цифру, то вывести строку «digit», если латинскую букву — вывести строку «lat»,
     * если кириллическую — вывести строку «rus».
     */
    public static void task6() {
        boolean flag = true;
        char str = 's';
        int code = (int) str;
        if (code >= 48 && code <= 57) {
            System.out.println("digit");
        }
        if (code >= 65 && code <= 122) {
            System.out.println("lat");
        }
        if (code >= 1040 && code <= 1103 || code == 1105 || code == 1025) {
            System.out.println("rus");
        }
        System.out.println(code);
    }

    /**
     * 17. Дана строка. Преобразовать в ней все строчные буквы (как латинские, так и кириллические) в прописные.
     */
    public static void task17() {
        System.out.println("Введите что-нибудь в строку:");
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        System.out.println(new String(chars));
    }

    /**
     * 40. Дана строка, содержащая по крайней мере один символ пробела.
     * Вывести подстроку, расположенную между первым и последним пробелом исходной строки.
     * Если строка содержит только один пробел, то вывести пустую строку.
     */
    private static void task40() {
        System.out.println("Введите что-нибудь в строку:");
        String str = scan.nextLine().trim();
        String[] words = str.split(" ");
        if (words.length > 2) {
            for (int i = 1; i < words.length - 1; i++) {
                System.out.print(words[i] + " ");
            }
        } else {
            System.out.println(" ");
        }
    }

    /**
     * 61.Дана строка, содержащая полное имя файла.
     * Выделить из этой строки название последнего каталога (без символов «\»).
     * Если файл содержится в корневом каталоге, то вывести символ «\».
     */
    public static void task61() {
        String str = "C:\\Users\\Ivan\\Desktop\\Java";
        char[] chars = str.toCharArray();
        str = "";
        int code;
        for (int i = 0; i < chars.length; i++) {
            code = (int) chars[i];
            if (code == 92) {
                code = 32;
            }
            str += ((char) code);
        }
        String[] words = str.split(" ");
        if (words.length > 1) {
            System.out.println(words[words.length - 1]);
        } else {
            System.out.println("\\");
        }
    }
}
