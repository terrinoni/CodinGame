/*
 * The MIT License
 *
 * Copyright 2016 Marco Terrinoni.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package it.terrinoni.codingame.contest.codersstrikeback;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 *
 * @author Marco Terrinoni
 */
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int laps = in.nextInt();
        int checkpointCount = in.nextInt();
        int[] coordX = new int[checkpointCount];
        int[] coordY = new int[checkpointCount];
        for (int i = 0; i < checkpointCount; i++) {
            int checkpointX = in.nextInt();
            int checkpointY = in.nextInt();
            coordX[i] = checkpointX;
            coordY[i] = checkpointY;
        }

        // game loop
        while (true) {
            for (int i = 0; i < 2; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int vx = in.nextInt();
                int vy = in.nextInt();
                int angle = in.nextInt();
                int nextCheckPointId = in.nextInt();
                int currCheckX = coordX[nextCheckPointId];
                int currCheckY = coordY[nextCheckPointId];
                int distance = (int) Math.sqrt(Math.pow((x - currCheckX), 2) + Math.pow((y
                        - currCheckY), 2));
                int speed = 100;
                if (distance < 700) {
                    //System.out.println(currCheckX + " " + currCheckY + " SHIELD");
                    System.out.println(currCheckX + " " + currCheckY + " 50");
                } else {
                    System.out.println(currCheckX + " " + currCheckY + " " + speed);
                }

            }
            for (int i = 0; i < 2; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int vx = in.nextInt();
                int vy = in.nextInt();
                int angle = in.nextInt();
                int nextCheckPointId = in.nextInt();
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
    }
}

class Point {

    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFrom(Point p) {
        return (int) Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
    }

    public static int getDistance(Point p1, Point p2) {
        return (int) Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }

}
