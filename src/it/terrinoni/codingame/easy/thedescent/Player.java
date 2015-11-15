/*
 * The MIT License
 *
 * Copyright 2015 Marco Terrinoni.
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
package it.terrinoni.codingame.easy.thedescent;

import java.util.*;

/**
 * The enterprise is in danger: drawn towards the surface of an unknown planet, it is at risk of
 * crashing against towering mountains.
 *
 * Help Kirk and Spock destroy the mountains... Save the enterprise!
 *
 * Topic: search in an array
 *
 * This puzzle is the first of a series of two exercises proposed as part of the "Kirs's Quest" past
 * contest. Want to know more about the quest? Move to the hard level puzzle "The Labyrinth"
 *
 * @author Marco Terrinoni
 */
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int highestMountainX = 0;
        int highestMountainH = 0;

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            // int spaceY = in.nextInt(); // no need for this variables
            for (int i = 0; i < 8; i++) { // find the highest mountain
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (mountainH >= highestMountainH) {
                    highestMountainH = mountainH;
                    highestMountainX = i;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            //System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
            if (spaceX == highestMountainX) {
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD");
            }
            // Reset values
            highestMountainH = 0;
            highestMountainX = 0;
        }
    }
}
