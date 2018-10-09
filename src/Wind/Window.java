package Wind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Window extends JFrame {
    public Window() throws HeadlessException {
        setTitle("TestTitle");
        setBounds(300, 150, 600, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setResizable(false);

        JButton jbtn1 = new JButton("Ok");
        JButton jbtn2 = new JButton("Close");
        JButton jbtn3 = new JButton("Root");
        JButton jbtn4 = new JButton("Broot");

        JTextArea jta = new JTextArea();

        JPanel jp = new JPanel(new GridLayout(1, 1));
        JPanel jpCenter = new JPanel(new GridLayout(1, 1));
        jbtn1.setPreferredSize(new Dimension(90, 30));

        JTextField jTextField = new JTextField();
//        JLabel jLabel = new JLabel();

        jpCenter.add(jta);
        jp.add(jbtn1);
//        jp.add(jbtn2);
//        jp.add(jbtn3);
//        jp.add(jbtn4);

        add(jTextField, BorderLayout.NORTH);

        add(jp, BorderLayout.SOUTH);
        add(jpCenter, BorderLayout.CENTER);
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jTextField.getText());
                jta.append(jTextField.getText() + "\n");
            }
        });
    }
}





class Cat {
    private int satiety;
    private int appetite;
    private String name;

    public Cat(int satiety, int appetite, String name) {
        this.satiety = satiety;
        this.appetite = appetite;
        this.name = name;
    }
    public boolean satietyCheck(int satiety){//Спрашивает, сытый ли кот
        this.satiety = satiety;
        if (satiety > 0){
            return true;
        }else{
            return false;
        }
    }
    public void eat(Plate p) {
        if (satietyCheck(satiety) == true) {//Если кот сытый
            System.out.println("Не хочу");
        }else if (p.n(appetite) == false){//Если коту не хватает еды
            System.out.println("Тут не хватает еды");
        }else{
            p.decreaseFood(appetite);
            satiety = satiety + appetite;
        }
    }
    public boolean chek(){//Поел, а может он еще сытый?

        if (satiety != 0){
            return true;
        }else {
            return false;
        }
    }
    public void info(){
        System.out.println(name + " " + chek());
    }

}

class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public boolean n(int n){//Запрашивает, хватает ли еды в тарелке
        if (food > n){
            return true;
        }else{
            return false;
        }
    }

    public void info() {
        System.out.println("plate " + food);
    }
}


class WindowMain {
    public static void main(String[] args) {
        new Window();
        Scanner sc = new Scanner(System.in);
        System.out.println("Веди количество еды");

        Cat[] cats = {
                new Cat(0,10,"Barsic"),
                new Cat(0, 15,"Tom"),
                new Cat(1,80,"Chak"),
                new Cat(0,20,"Boss")
        };
        Plate plate = new Plate(sc.nextInt());

        do {
            for (Cat cat:cats ){
                cat.eat(plate);
                plate.info();
                cat.info();

            }System.out.println("Введи 1 если хочешь пополнить кормушку, введи 0 если хочешь завершить");
        }while (sc.nextInt() == 1);
        System.out.println("До встречи!");
    }
}