package org.afan;

import processing.core.PApplet;

public class KochSnowflake extends PApplet {
    int width = 1000;
    int height = 800;
    String word;
    String theword = "";
    float len = 2000;

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        word = "F--F--F";
        background(0);
        print(word + "\n");
        run();
    }

    @Override
    public void draw() {

    }

    public void Lsystem() {//科赫曲線
        for (int i = 0; i < word.length(); i += 1) {
            if (word.charAt(i) == 'F') {
                theword += "F+F--F+F";
            } else {
                theword += word.charAt(i);
            }
        }
        word = theword;
        theword = "";
    }

    @Override
    public void keyPressed() {
        Lsystem();
        print(word + "\n");
        run();
    }

    public void run() {
        background(0);
        translate((float) width * 7 / 10, (float) height * 9 / 10);
        stroke(random(100) + 155, random(100) + 155, random(100) + 155);
        len /= 3;
        for (int i = 0; i < word.length(); i += 1) {
            if (word.charAt(i) == 'F') {
                line(0, 0, 0, -len);
                translate(0, -len);
            } else if (word.charAt(i) == '+') {
                rotate(PI / 3);
            } else if (word.charAt(i) == '-') {
                rotate(-PI / 3);
            } else if (word.charAt(i) == '[') {
                pushMatrix();
            } else if (word.charAt(i) == ']') {
                popMatrix();
            }
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[]{"org.afan.KochSnowflake"};
        PApplet.main(appletArgs);
    }
}
