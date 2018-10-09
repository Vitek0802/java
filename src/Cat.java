import java.util.Scanner;

public class Cat {
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

class MainCatAndPlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Веди количество еды");

        Cat[] cats = {
                new Cat(0,10,"Barsic"),
                new Cat(1, 15,"Tom"),
                new Cat(0,80,"Chak"),
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
