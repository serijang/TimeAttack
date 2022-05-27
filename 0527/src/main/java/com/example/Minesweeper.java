package com.example;

public class Minesweeper {
    public static int MAP_X = 10;
    public static int MAP_Y = 10;
    private int[][] map;
    private int numOfpick;

    public Minesweeper(int[][] map) {
        this.map = map;
        this.numOfpick = 0;
    }

    public int pick(int x, int y) {
        int numOfMine = 0;
        // todo
        return numOfMine;
    }

    public int getNumOfpick() {
        return numOfpick;
    }

    public boolean checkMap() {
        // todo
        return false;
    }

    public void printMap() {
        for (int i = 0; i < MAP_X; i++) {
            for (int j = 0; j < MAP_Y; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
