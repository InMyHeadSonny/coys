package javapractice;

import jdk.jfr.Event;

import java.awt.*;
import java.awt.event.*;


class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}



class Ex7_19 {
    public static void main(String[] args) {
        Button c = new Button("Start");
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }

        );
    }
}

public class oops15 {
}
