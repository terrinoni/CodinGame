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
        Point[] coords = new Point[checkpointCount];
        for (int i = 0; i < checkpointCount; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            coords[i] = new Point(x, y);
        }

        // game loop
        while (true) {
            Point currPos1 = null;
            Point currPos2 = null;
            Point currPos = null;
            int distance1 = 0;
            int distance2 = 0;
            int distance = 0;
            for (int i = 0; i < 2; i++) {
                // Extract current position
                int x = in.nextInt();
                int y = in.nextInt();
//                if(i == 0) {
//                    currPos1 = new Point(x, y);
//                } else {
//                    currPos2 = new Point(x, y);
//                }
                currPos = new Point(x, y);
                // Extract current velocity (not used)
                int vx = in.nextInt();
                int vy = in.nextInt();
                // Extract current angle (not used)
                int angle = in.nextInt();
                // Extract distance from next check point
                int nextCheckPointId = in.nextInt();
                Point nextCheck = coords[nextCheckPointId];
                int speed = 0;
//                if(i == 0) {
//                    distance1 = Point.getDistance(currPos1, nextCheck);
//                    if(distance1 <= 800) {
//                        speed = 0;
//                    } else if(distance1 > 800 && distance1 < 5000) {
//                        speed = distance1 % 200;
//                    } else {
//                        speed = 200;
//                    }
//                } else {
//                    distance2 = Point.getDistance(currPos2, nextCheck);
//                }
                distance = Point.getDistance(currPos, nextCheck);
                if(distance <= 800) {
                    speed = 0;
                } else if (distance > 800 && distance < 5000) {
                    speed = distance % 200;
                } else {
                    speed = 200;
                }
                System.out.println(nextCheck.x + " " + nextCheck.y + " " + speed);
            }
            

            for (int i = 0; i < 2; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int vx = in.nextInt();
                int vy = in.nextInt();
                int enemyAngle = in.nextInt();
                int enemyNextCheckPointId = in.nextInt();
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
