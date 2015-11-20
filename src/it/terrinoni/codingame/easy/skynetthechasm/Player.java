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
package it.terrinoni.codingame.easy.skynetthechasm;

import java.util.*;

/**
 * You wouldn't think of anything easier than making a terminator bike jump over a hole between two
 * sides of a bridge, would you? It's all about finding the right balance between acceleration and
 * deceleration...
 *
 * Anyway, the resistance is counting on you: you must capture this bike!
 *
 * Topic: conditional statements (if...)
 *
 * This easy puzzle is the first in a series of two exercises proposed during the now closed "Skynet
 * Revolution" contest. Once solved feel free to try and master the second puzzle "Skynet: the
 * Bridge" based on the same universe but with a more complex algorithmic topic.
 *
 * @author Marco Terrinoni
 */
public class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.

            if (coordX < (road - 1) && speed <= gap) { // initial acceleration
                System.out.println("SPEED");
            } else if (speed > (gap + 1)) { // slow down if start too fast
                System.out.println("SLOW");
            } else if (coordX == (road - 1)) { // jump when close to the gap
                System.out.println("JUMP");
            } else if (coordX >= road) { // slow down after the jump
                System.out.println("SLOW");
            } else { // nothing to do
                System.out.println("WAIT");
            }
        }
    }
}
