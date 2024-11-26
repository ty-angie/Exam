import GPS.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LocationSystem s = new LocationSystem();
        //try
        try{System.out.println(s.getCoords(30));}
        catch(IOException e){System.out.println("e");}

        Lion lion = new Lion(7,"Simba", 30);
        Keeper keeper = new Keeper("Geoff","4392",80);
        Drone drone = new Drone("124MHz", 124,"Monitor1");

        calculateDistance distance = new calculateDistance(keeper,lion);
        AlertSystem alertSystem = new AlertSystem();
        if(distance.getDistance()>60){
            alertSystem.alertAKeeper(keeper.getPhoneNumber());
            alertSystem.alertADrone(Integer.valueOf(drone.getRadioF()));
        }


        drawPanel map = new drawPanel(lion, keeper, drone);

        JFrame f=new JFrame();
        f.setSize(600, 600);
        //f.setLayout(new GridLayout(1, 2));
        f.setVisible(true);
        //f.add(map);

        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });




    }
}