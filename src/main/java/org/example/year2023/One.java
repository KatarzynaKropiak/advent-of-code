package org.example.year2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class One {
    public static char first;
    public static char last;
    public static int sum;
    public static int result;
    public static List<String> lines = new ArrayList<>();

        private static String replaceTextWithDigits(String str) {

            str =  str.replaceAll("eight", "e8t")
                    .replaceAll("two", "2o")
                    .replaceAll("one", "1")
                    .replaceAll("three", "3")
                    .replaceAll("four", "4")
                    .replaceAll("five", "5")
                    .replaceAll("six", "6")
                    .replaceAll("seven", "7")
                    .replaceAll("nine", "9");

            return str;
        }


    public static int findResult(String str) {
        str = replaceTextWithDigits(str);
        List<Character> list = new ArrayList<>();
        str.chars().forEach(c -> list.add((char) c));


        for (Character c : list) {
            if (Character.isDigit(c)) {
                first = c;
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (Character.isDigit(list.get(i))) {
                last = list.get(i);
                break;
            }
        }
           

        String concatenatedChars = "" + first + last;
        result = Integer.parseInt(concatenatedChars);
        System.out.println(result);

        return result;
        }

        public static int findSum() {

            try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Kropka\\Desktop\\java\\adventOfCode\\input1.txt"))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            lines.stream().forEach(c -> sum += findResult(c));
        return sum;
        }
    }

