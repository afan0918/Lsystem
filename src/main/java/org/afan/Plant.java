package org.afan;

import processing.core.PApplet;

public class Plant extends PApplet {
    int width = 1000;
    int height = 800;
    String word;
    String theword = "";
    float len = 20;

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        word = "F";
        background(0);
        print(word + "\n");
    }

    @Override
    public void draw() {

    }

    public void Lsystem() {
        for (int i = 0; i < word.length(); i += 1) {
            if (word.charAt(i) == 'F') {
                theword += "FF+[+F-F]-[+F-F]";
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
        translate((float) width / 2, height);
        stroke(random(100) + 155, random(100) + 155,random(100) + 155);
        for (int i = 0; i < word.length(); i += 1) {
            len = random(5, 10);
            if (word.charAt(i) == 'F') {
                line(0, 0, 0, -len);
                translate(0, -len);
            } else if (word.charAt(i) == '+') {
                rotate(random(PI / 12, PI / 6));
            } else if (word.charAt(i) == '-') {
                rotate(-random(PI / 12, PI / 6));
            } else if (word.charAt(i) == '[') {
                pushMatrix();
            } else if (word.charAt(i) == ']') {
                popMatrix();
            }
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[]{"org.afan.Plant"};
        PApplet.main(appletArgs);
    }
}
