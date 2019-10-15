import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
public class Calculator {
    boolean run = true;
    ArrayList<Double> addArray = new ArrayList<Double>();
    ArrayList<Double> subArray = new ArrayList<Double>();
    ArrayList<Double> multArray = new ArrayList<Double>();
    ArrayList<Double> divArray = new ArrayList<Double>();
    double addSum = 0;
    double subDif = 0;
    double multPro = 0;
    double divFac = 0;
    public Calculator() {

    }
    public void add() {
        while(run) {
            Scanner a = new Scanner(System.in);
            double add = a.nextDouble();
            addArray.add(add);
            if(a.equals("=")) {
                run = false;
            }
        }
        for(int i = 0; i < addArray.size(); i++) {
            addSum += addArray.get(i);
        }
        System.out.println(addSum);
    }
    public void subtract() {
        while(run) {
            Scanner s = new Scanner(System.in);
            double sub = s.nextDouble();
            subArray.add(sub);
            if(s.equals("=")) {
                run = false;
            }
        }
        for(int j = 0; j < subArray.size(); j++) {
            subDif -= subArray.get(j);
        }
        System.out.println(subDif);
    }
    public void multiply() {
        while(run) {
            Scanner m = new Scanner(System.in);
            double mult = m.nextDouble();
            multArray.add(mult);
            if(m.equals("=")) {
                run = false;
            }
        }
        for(int f = 0; f < multArray.size(); f++) {
            multPro *= multArray.get(f);
        }
        System.out.println(multPro);
    }
    public void divide() {
        while(run) {
            Scanner d = new Scanner(System.in);
            double div = d.nextDouble();
            divArray.add(div);
            if(d.equals("=")) {
                run = false;
            }
        }
        for(int h = 0; h < divArray.size(); h++) {
            divFac /= divArray.get(h);
        }
        System.out.println(divFac);
    }
}
