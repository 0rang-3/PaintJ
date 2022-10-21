import processing.core.PApplet;
import javax.swing.*;

public class Main extends PApplet {
    int hor = 60;
    int ver = 60;
    int shape = 0;
    public void settings() {
        size(600,600);
    }
    public void setup() {
        JOptionPane.showMessageDialog(null, "Welcome to PaintJ, coded by 0rang-3!");
        JOptionPane.showMessageDialog(null, "To change the color of the brush, press the following keybinds\nr = red\no = orange\ny = yellow\nb = blue\np = purple\nw = white\nl = black");
        JOptionPane.showMessageDialog(null, "To change the size of the brush, press the following keybinds\nUP ARROW = increase vertical size\nDOWN ARROW = decrease vertical size\nRIGHT ARROW = increase horizontal size\nLEFT ARROW = decrease horizontal size");
        JOptionPane.showMessageDialog(null, "To change the shape of the brush, press s\nTo use the eraser, press e\nTo clear the project, press c\nTo reset the brush shape and size, press t");
        JOptionPane.showMessageDialog(null, "Happy Painting!");
        stroke(255, 255, 255);
    }
    public void draw() {
        if(mousePressed) {
            if(shape == 0) {
                ellipse(mouseX, mouseY, hor, ver);
            } else {
                rect(mouseX - ver/2, mouseY - hor/2, hor, ver);
            }
        }
        if(keyPressed == true) {
            if(key == 's') {
                if(shape == 0) {
                    shape = 1;
                    return;
                } else {
                    shape = 0;
                    return;
                }
            }
            if(key == 'r') {
                fill(255, 0, 0);
                stroke(255, 0, 0);
            }
            if(key == 'o') {
                fill(255, 165, 0);
                stroke(255, 165, 0);
            }
            if(key == 'y') {
                fill(255, 255, 0);
                stroke(255, 255, 0);
            }
            if(key == 'g') {
                fill(0, 255, 0);
                stroke(0, 255, 0);
            }
            if(key == 'b') {
                fill(0, 0, 255);
                stroke(0, 0, 255);
            }
            if(key == 'p') {
                fill(150, 0, 255);
                stroke(150, 0, 255);
            }
            if(key == 'w') {
                fill(255, 255, 255);
                stroke(255, 255, 255);
            }
            if(key == 'l') {
                fill(0, 0, 0);
                stroke(0, 0, 0);
            }
            if(key == 'e') {
                fill(204, 204, 204);
                stroke(204, 204, 204);
            }
            if(key == 'c') {
                fill(204, 204, 204);
                stroke(204, 204, 204);
                rect(0, 0, 600, 600);
                fill(255, 255, 255);
                stroke(255, 255, 255);
            }
            if(key == 't') {
                fill(255, 255, 255);
                stroke(255, 255, 255);
                shape = 0;
                hor = 60;
                ver = 60;
            }
            if(key == CODED) {
                if(keyCode == UP) {
                    ver = ver + 5;
                }
                if(keyCode == DOWN) {
                    if(ver > 0) {
                        ver = ver - 5;
                    }
                }
                if(keyCode == LEFT) {
                    if(hor > 0) {
                        hor = hor - 5;
                    }
                }
                if(keyCode == RIGHT) {
                    hor = hor + 5;
                }
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}