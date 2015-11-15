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
package it.terrinoni.codingame.easy.powerofthor;

import java.util.*;

/**
 * Thor's hammer, Mjöllnir has lost all of its powers... Will you be able to guide Thor towards the
 * light of power to make the hammer whole again?
 *
 * Topic: condition statements (if...).
 *
 * This easy puzzle is the first of a series of two proposed during the past contest “Ragnarök”.
 * Once the hammer is re-activated, go to the next puzzle to try and defeat the giants in the “Thor
 * VS Giants”. Much harder!
 *
 * @author Marco Terrinoni
 */
public class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        int thorX = initialTX;
        int thorY = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            String directionX = "";
            String directionY = "";

            if (thorX > lightX) {
                directionX = "W";
                thorX--;
            } else if (thorX < lightX) {
                directionX = "E";
                thorX++;
            }

            if (thorY > lightY) {
                directionY = "N";
                thorY--;
            } else if (thorY < lightY) {
                directionY = "S";
                thorY++;
            }

            //System.out.println("E"); // A single line providing the move to be made: N NE E SE S SW W or NW
            if (directionX.compareTo(directionY) != 0) {
                System.out.println(directionY.concat(directionX));
            } else {
                System.out.println(directionX);
            }
        }
    }
}
