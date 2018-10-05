//package Game;
//
//import java.util.Random;
//
//abstract class Hero {
//    protected int heal;
//    protected String name;
//    protected int addHeal;
//    protected int damage;
//
//    public Hero(int heal, String name, int damage, int addHeal) {
//        this.heal = heal;
//        this.name = name;
//        this.damage = damage;
//        this.addHeal = addHeal;
//    }
//
//    abstract void hit(Hero hero);
//    abstract void healing(Hero hero);
//
//    void causeDamage(int damage) {
//        heal -= damage;
//        if (heal <= 0){
//            System.out.println(name + ": Я погиб!");
//        }
//    }
//
//    void addHealth(int addHeal) {
//        this.heal += addHeal;
//    }
//
//    void info() {
//        System.out.println("Имя: " + name + "\nЗдоровье: " + heal + "\nУрон: " + damage + "\nЛечение: " + addHeal + "\n");
//    }
//
//}
//
//
//abstract class Artefact {
//    protected int healArt;
//    protected String nameArt;
//    protected int addHealArt;
//    protected int damageArt;
//
//    public Artefact(int healArt, String nameArt, int damageArt, int addHealArt) {
//        this.healArt = healArt;
//        this.nameArt = nameArt;
//        this.damageArt = damageArt;
//        this.addHealArt = addHealArt;
//    }
//
//    abstract void hitArt(Artefact artefact);
//    abstract void healingArt(Artefact artefact);
//    abstract void addHealArt(Artefact artefact);
//
//    void causeDamageArt(int damageArt) {
//        healArt -= damageArt;
//    }
//
//    void addHealthArt(int addHealArt) {
//        this.healArt += addHealArt;
//    }
//
//
//
//}
//class Art extends Artefact{
//    public Art(int healArt, String typeArt, int damageArt, int addHealArt) {
//        super(healArt, typeArt, damageArt, addHealArt);
//    }
//
//    @Override
//    void hitArt(Artefact artefact) {
//        if(artefact != this) {
//            artefact.causeDamageArt(damageArt);
//        }
//    }
//
//    @Override
//    void healingArt(Artefact artefact) {
//    }
//    @Override
//    void addHealArt(Artefact artefact){
//
//    }
//}
//
//
//class Warrior extends Hero {
//
//    public Warrior(int heal, String type, int damage, int addHeal) {
//        super(heal, type, damage, addHeal);
//    }
//
//    @Override
//    void hit(Hero hero) {
//        if(hero != this) {
//            hero.causeDamage(damage);
//        }
//    }
//
//    @Override
//    void healing(Hero hero) {
//        System.out.println("Войны не умеют лечить!");
//    }
//}
//class Healing extends Hero {
//
//    public Healing(int heal, String type, int damage, int addHeal) {
//        super(heal, type, damage, addHeal);
//    }
//
//
//    @Override
//    void healing(Hero hero) {
//
//            hero.addHealth(addHeal);
//
//    }
//
//    @Override
//    void hit(Hero hero) {
//        System.out.println("Врачи не сражаются!");
//    }
//}
//class Asasin extends Hero {
//
//    public Asasin(int heal, String type, int damage, int addHeal) {
//        super(heal, type, damage, addHeal);
//    }
//
//
//    @Override
//    void hit(Hero hero) {
//        if(hero != this) {
//            hero.causeDamage(damage);
//        }
//    }
//
//    @Override
//    void healing(Hero hero) {
//        System.out.println("Асасины не умеют лечить!");
//    }
//}
//class Game {
//    public static void main(String[] args) {
//
//        Hero[] heroI = new Hero[] {
//                new Warrior(150, "Тигрил", 50, 0),
//                new Healing(50,"Доктор", 0, 25),
//                new Asasin(20, "Ас", 70, 0)};
//        Hero[] heroII = new Hero[] {
//                new Warrior(190, "Минотавр", 60, 0),
//                new Healing(60, "Дог", 0,30),
//                new Asasin(15,"Асса", 60,0)};
//        System.out.println("Первая команда: ");
//        for (Hero hero:heroI) {
//            hero.info();
//        }
//        System.out.println("Вторая команда:");
//        for (Hero hero:heroII) {
//            hero.info();
//        }
//
//
//        for(;;){
//            Random rand = new Random();
//            rand.nextInt(110);
//            if(rand.nextInt() >= 1 && rand.nextInt() <= 50){
//                heroI[0].hit(heroII[0]);
//                heroII[0].hit(heroI[0]);
//                if(heroI[0].heal == 0 | heroII[0].heal == 0){
//                    System.out.println("Прощай жестокий мир!");
//                    break;
//                }
//            }
//            if(rand.nextInt() > 50 && rand.nextInt() < 100){
//                heroI[1].healing(heroI[0]);
//                heroII[1].healing(heroII[0]);
//                if(heroI[0].heal == 0 | heroII[0].heal == 0){
//                    System.out.println("Не могу лечить, он мертв");
//                    break;
//                }
//            }
//            if(rand.nextInt() > 101 && rand.nextInt() < 110){
//                heroI[2].hit(heroII[0]);
//                heroII[2].hit(heroI[0]);
//                if(heroI[0].heal == 0 | heroII[0].heal == 0){
//                    System.out.println("Он уже мертв");
//                    break;
//                }
//            }
//            if (rand.nextInt() > 50 && rand.nextInt() < 60){
//                Art.hitArt(heroI[0]);
//            }
//        }
//
////
////        Hero heroTigril = new Warrior(150, "Тигрил", 50, 0);
////        Hero heroMinotavr = new Warrior(190, "Минотавр", 60, 0);
////
////        Hero heroDoc = new Healing(50,"Доктор", 0, 25);
////        Hero heroDog = new Healing(60, "Дог", 0,30);
////
////        Hero heroAs = new Asasin(20, "Ас", 70, 0);
////        Hero heroAssa = new Asasin(15,"Асса", 60,0);
//
////        heroTigril.info();
////        heroMinotavr.info();
////
////        heroMinotavr.hit(heroTigril);
////        heroDoc.healing(heroTigril);
////        heroTigril.hit(heroMinotavr);
////        heroDog.healing(heroMinotavr);
////        heroAs.hit(heroMinotavr);
////        heroAssa.hit(heroTigril);
////        heroMinotavr.hit(heroTigril);
////        heroDoc.healing(heroTigril);
////        heroTigril.hit(heroMinotavr);
////        heroDog.healing(heroMinotavr);
////        heroAs.hit(heroMinotavr);
////        heroAssa.hit(heroTigril);
////        heroMinotavr.hit(heroTigril);
////        heroDoc.healing(heroTigril);
////        heroTigril.hit(heroMinotavr);
////        heroDog.healing(heroMinotavr);
////        heroAs.hit(heroMinotavr);
////        heroAssa.hit(heroTigril);
//
////        heroI.info();
////        heroII.info();
//    }
//}
