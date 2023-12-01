package org.algoritm.yandex;

import java.util.Scanner;

public class Sosedi {
    public int[] computeArr() {
        Scanner scanner = new Scanner(System.in);
        int numColumn = Integer.parseInt(scanner.nextLine());
        int numStr = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[numColumn][numStr];
        for (int i = 0; i < numColumn; i++) {
            int j = 0;
            for (String s : scanner.nextLine().split(" ")) {
                matrix[i][j++] = Integer.parseInt(s);
            }
        }
        int stringIndex = Integer.parseInt(scanner.nextLine());
        int columnIndex = (scanner.nextInt());
        int[] rsl = columnIndex == 0 || stringIndex == 0 ? new int[2] : new int[4];
        if (columnIndex != 0 && columnIndex + 1 < matrix[stringIndex].length) {
            rsl[2] = matrix[stringIndex][columnIndex - 1];
            rsl[3] = matrix[stringIndex][columnIndex + 1];
        } else if (columnIndex != 0) {
            rsl[1] = matrix[stringIndex][columnIndex - 1];
        } else if (columnIndex + 1 < matrix[stringIndex].length) {
            rsl[1] = matrix[stringIndex][columnIndex + 1];
        }
        if (stringIndex != 0 && stringIndex + 1 < matrix.length) {
            rsl[0] = matrix[stringIndex - 1][columnIndex];
            rsl[1] = matrix[stringIndex + 1][columnIndex];
        } else if (stringIndex != 0) {
            rsl[0] = matrix[stringIndex - 1][columnIndex];
        } else if (stringIndex + 1 < matrix.length) {
            rsl[0] = matrix[stringIndex + 1][columnIndex];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Sosedi sosedi = new Sosedi();
        for (int i : sosedi.computeArr()) {
            System.out.print(i + " ");
        }
    }
}
