package org.example.year2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Two {
    public static List<String> lines = new ArrayList<>();
    public static int red = 12;
    public static int green = 13;
    public static int blue = 14;
    public static int sumOfIndex = 0;

    public static int checkLines() {
//        lines.add("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
//        lines.add("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue");
//        lines.add("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red");
//        lines.add("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red");
//        lines.add("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Kropka\\Desktop\\java\\adventOfCode\\input2.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            sumLine(line);
            System.out.println("Wynik to:" + sumLine(line));

            sumOfIndex = sumOfIndex + sumLine(line);
        }
        System.out.println("Suma indeksów to: " + sumOfIndex);
        return sumOfIndex;
    }

    public static int sumLine(String inputString) {

        String[] substrings = inputString.split(":");
        String[] games = substrings[1].split(";");
        String[] gameIndex = substrings[0].split(" ");

        int index = Integer.valueOf(gameIndex[1]);

        for (String game : games) {
            System.out.println("&" + index + "&");
            System.out.println(game);
            String[] colors = game.split(",");
            for (String color : colors) {
                //    System.out.println(color);
                String[] parts = color.split(" ");
                //    System.out.println(parts[1]);
                //    if (colors.length == 3) {
                int numberOfCubes = Integer.valueOf(parts[1]);
                String colorOfCubes = parts[2];
                    System.out.println("Number: " + numberOfCubes + " Color: " + colorOfCubes);
                if (colorOfCubes.equals("red") && numberOfCubes > red) {
                    index = 0;
                }
                if (colorOfCubes.equals("blue") && numberOfCubes > blue) {
                    index = 0;
                }
                if (colorOfCubes.equals("green") && numberOfCubes > green) {
                    index = 0;
//
                }
            }
        }
        return index;


    }
}