package Lesson_6;
/*

* Я так и не разобрался до конца как сделать это задание
* оно казалось простым, но пришлось прибегнуть к помощи наставника.
* Наставник помог, показал как правильнее оформить код,
* я переделал его версию, добавил новые строки,
* но назначение некоторых остались для меня загадкой,
* в самом конце моя первоначальная версия кода.

 */
abstract class Animal {
    public abstract boolean run(double run);

    public abstract boolean jump(double jump);

    public abstract boolean swim(double swim);
}


class Cat extends Animal {
    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 200);
    }

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 2);
    }

    @Override
    public boolean swim(double swim) {
        return false;
    }
}
class Dog extends Animal {
    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 500);
    }
    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 0.5);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }
}

class catBarsik extends Cat{

}
class catLex extends Cat{

}

class dogBobik extends Dog {

}
class dogRex extends Dog {

}





public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new catBarsik(){
            @Override
            public boolean run(double run){
                return true;
            }
            @Override
            public boolean jump(double jump) {
                return true;
            }
            @Override
            public boolean swim(double swim){
                return false;
            }
            }, new catLex(){
            @Override
            public boolean run(double run){
                return true;
            }
            @Override
            public boolean jump(double jump) {
                return true;
            }
            @Override
            public boolean swim(double swim){
                return false;
            }
            }, new dogBobik(){
            @Override
            public boolean run(double run){
                return true;
            }
            @Override
            public boolean jump(double jump) {
                return false;
            }
            @Override
            public boolean swim(double swim){
                return true;
            }
            }, new dogRex(){
            @Override
            public boolean run(double run){
                return true;
            }
            @Override
            public boolean jump(double jump) {
                return false;
            }
            @Override
            public boolean swim(double swim){
                return false;
            }
            }
        };

        for (Animal animal : animals) {
            System.out.printf("%s run: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(201));
            System.out.printf("%s jump: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.jump(0.5));
            System.out.printf("%s swim: %s\n\n",
                    animal.getClass().getSimpleName(),
                    animal.swim(8));
        }

        Animal catB = new catBarsik() {
            @Override
            public boolean run(double run) {
                return false;
            }

            @Override
            public boolean jump(double jump) {
                return true;
            }

            @Override
            public boolean swim(double swim) {
                return false;
            }
        };
        Animal catL = new catLex() {
            @Override
            public boolean run(double run) {
                return false;
            }

            @Override
            public boolean jump(double jump) {
                return false;
            }

            @Override
            public boolean swim(double swim) {
                return false;
            }
        };

        Animal dogB = new dogBobik() {
            @Override
            public boolean run(double run) {
                return false;
            }

            @Override
            public boolean jump(double jump) {
                return false;
            }

            @Override
            public boolean swim(double swim) {
                return false;
            }
        };
        Animal dogR = new dogRex() {
            @Override
            public boolean run(double run) {
                return false;
            }

            @Override
            public boolean jump(double jump) {
                return false;
            }

            @Override
            public boolean swim(double swim) {
                return false;
            }
        };


        assert !catB.run(201);
        assert catB.run(200);

        assert !catL.run(191);
        assert catL.run(190);

        assert !dogB.run(501);
        assert catB.run(500);

        assert !dogR.run(401);
        assert dogR.run(400);
    }
}

//package Lesson_6;
//
//        import java.util.Scanner;
//
//abstract class Animals {
//    protected String name;
//    protected int runningDistance;
//    protected double jumpHeight;
//    protected int swimmingRange;
//
//    public Animals(String name, int runningDistance, double jumpHeight, int swimmingRange){
//        this.name = name;
//        this.runningDistance = runningDistance;
//        this.jumpHeight = jumpHeight;
//        this.swimmingRange = swimmingRange;
//    }
//
//
//    public void info(){
//        System.out.println("Информация о животном: " + "\nИмя" + name + "\nДальность бега: " + runningDistance +
//                "\nВысота прыжка: " + jumpHeight + "\nДальность плавания: " + swimmingRange);
//    }
//}
//class CatBarsik extends Animals{
//
//    public CatBarsik(String name, int runningDistance, double jumpHeight, int swimmingRange){
//        super(name, runningDistance, jumpHeight, swimmingRange);
//    }
//    public void BarsikInfo(){
//        System.out.println("Информация о коте: " + "\nИмя: " + name + "\nДальность бега: " + runningDistance +
//                "\nВысота прыжка: " + jumpHeight + "\nДальность плавания: " + swimmingRange);
//    }
//}
//class CatRedhead extends Animals{
//
//    public CatRedhead(String name, int runningDistance, double jumpHeight, int swimmingRange){
//        super(name, runningDistance, jumpHeight, swimmingRange);
//    }
//    public void RedheadInfo(){
//        System.out.println("Информация о коте: " + "\nИмя: " + name + "\nДальность бега: " + runningDistance +
//                "\nВысота прыжка: " + jumpHeight + "\nДальность плавания: " + swimmingRange);
//    }
//}
//class DogBobik extends Animals{
//
//    public DogBobik(String name, int runningDistance, double jumpHeight, int swimmingRange){
//        super(name, runningDistance, jumpHeight, swimmingRange);
//    }
//    public void BobikInfo(){
//        System.out.println("Информация о собаке: " + "\nИмя: " + name + "\nДальность бега: " + runningDistance +
//                "\nВысота прыжка: " + jumpHeight + "\nДальность плавания: " + swimmingRange);
//    }
//}
//
//class DogRex extends Animals{
//
//    public DogRex(String name, int runningDistance, double jumpHeight, int swimmingRange){
//        super(name, runningDistance, jumpHeight, swimmingRange);
//    }
//    public void RexkInfo(){
//        System.out.println("Информация о собаке: " + "\nИмя: " + name + "\nДальность бега: " + runningDistance +
//                "\nВысота прыжка: " + jumpHeight + "\nДальность плавания: " + swimmingRange);
//    }
//}
//class work{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        DogBobik dogBobik = new DogBobik("Бобик", 500, 0.5, 10);
//        DogRex dogRex = new DogRex("Рекс", 700, 1, 15);
//        CatBarsik catBarsik = new CatBarsik("Барсик", 200, 2, 0);
//        CatRedhead catRedhead = new CatRedhead("Рыжик", 150, 1.5, 0);
//        System.out.println("Кто побежит?\n1.Бобик\n2.Рекс\n3.Барсик\n4.Рыжик");
//        if(sc.nextInt() == 1){
//            dogBobik.BobikInfo();
//        }
//        if(sc.nextInt() == 2){
//            dogRex.RexkInfo();
//        }
//        if(sc.nextInt() == 3){
//            catBarsik.BarsikInfo();
//        }
//        if(sc.nextInt() == 4){
//            catRedhead.RedheadInfo();
//        }
//
//        for(;;) {
//            System.out.println("Ознакомтесь с нашими животными: \n 1.Собака \n 2.Кошка");
//            if (sc.nextInt() == 1) {
//                System.out.println("У нас есть две собаки, о которой из них вы хотели бы узнать?\n1. Бобик \n2. Рекс");
//                if (sc.nextInt() == 1) {
//                    DogBobik dog = new DogBobik("Бобик", 500, 0.5, 10);
//                    dog.BobikInfo();
//                }
//                if (sc.nextInt() == 2) {
//                    DogRex dog = new DogRex("Рекс", 700, 1, 15);
//                    dog.RexkInfo();
//                }
//            }
//            if (sc.nextInt() == 2) {
//                System.out.println("У нас есть два кота, о котором из них вы хотели бы узнать?\n1. Барсик \n2. Рыжик");
//                if (sc.nextInt() == 1) {
//                    CatBarsik cat = new CatBarsik("Барсик", 200, 2, 0);
//                    cat.BarsikInfo();
//                }
//                if (sc.nextInt() == 2) {
//                    CatRedhead cat = new CatRedhead("Рыжик", 150, 1.5, 0);
//                    cat.RedheadInfo();
//                }
//            }
//            System.out.println("Желаете повторить?\n1. Да \n2. Нет");
//            if(sc.nextInt() == 2){
//                break;
//            }else if (sc.nextInt() == 1){
//
//            }
//        }
//
//    }
//}