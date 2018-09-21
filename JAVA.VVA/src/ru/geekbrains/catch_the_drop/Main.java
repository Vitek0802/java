package ru.geekbrains.catch_the_drop;

public class Main {

    public static void main(String[] args) {

        //закоментировал что бы небыло каши при запуске
        
        //      arrayOfInversions();//Вход 110110

        //       plusThree();

        //       mutationOfSmallDigits();//Вход 5,6,7,9,2,4,8,2,8

        //      matrixDiagonal();

        //       searchMinimumMaximum();

        //  ifTheSumsAreEqual();//Не работает, наработки удалил


        //   offsetOfElements(1);//Не работает, наработки удалил

        //      mirrorString("Привет");

    }

    static void arrayOfInversions() {
        int[] simpleArray = new int[6];
        simpleArray[0] = 1;
        simpleArray[1] = 1;
        simpleArray[2] = 0;
        simpleArray[3] = 1;
        simpleArray[4] = 1;
        simpleArray[5] = 0;
        for (int current_str : simpleArray) {
            if (current_str == 0) {
                current_str = 1;
            } else {
                current_str = 0;
            }
            System.out.print(current_str);
        }
    }

    static void plusThree() {//Когда сделал это задание ноль был, но теперь почему то пропал, как такое может быть?
        int[] simpleArray = new int[8];
        simpleArray[0] = 0;
        for (int i = 1; i < simpleArray.length; i++) {
            simpleArray[i] = simpleArray[i - 1] + 3;
            System.out.print(simpleArray[i] + " ");
        }
    }

    static void mutationOfSmallDigits() {
        int[] simpleArray = {5, 6, 7, 9, 2, 4, 8, 2, 8};

        for (int current_str : simpleArray) {
            if (current_str < 6) {
                current_str *= 2;
            }
            System.out.print(current_str + " ");
        }

    }

    static void matrixDiagonal() {//Здесь надо было крест на крест сделать?
        int[][] theArrayIsMoreComplicated = new int[9][];
        for (int i = 0; i < theArrayIsMoreComplicated.length; i++) {
            for (int j = 0; j < theArrayIsMoreComplicated.length; j++) {

                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    static void searchMinimumMaximum() {//Понимаю что не совсем верно, но это лучше что мне в голову пришло
        int[] simpleArray = new int[5];
        simpleArray[0] = 1;
        simpleArray[1] = 6;
        simpleArray[2] = 3;
        simpleArray[3] = 8;
        simpleArray[4] = 4;
        for (int current_str : simpleArray) {
            if (current_str == 8) {
                System.out.println(current_str);

            } else if (current_str == 1) {
                System.out.println(current_str);
            }
        }
    }

//   static void ifTheSumsAreEqual() {//здесь не могу понять как такое можно сделать
//        int[] arr =  {1,1};
//    }
//
//
//    static void offsetOfElements(int n) {//Как с этой ошибкой справиться или я не понля как должен массив быть сдвинут?
//        int [] arrMotion= {1,5,-85,632,47,-42};
//        for (int i = 0; i < arrMotion.length; ++i) {
//            System.out.println(arrMotion[i+n]);
//        }
//    }

    static void mirrorString(String string) {//Пока не придумал как автоматезировать подсчет количества символов
        char[] stringArray = string.toCharArray();
        char[] stringArrayRev = new char[stringArray.length];

        for (char i = 5; i < stringArray.length; i--) {
            stringArrayRev[i] = stringArray[i];
            System.out.print(stringArrayRev[i]);
        }
    }
//        for (int i = stringArray.length; i !=0 ; i--) {
//            System.out.println(i);
//        }

//        for (char stringArr : stringArray) {
//
//            System.out.print(stringArr);
//        }
//        System.out.println();
//        for (int i = stringArray.length; i > stringArray.length; i--) {
//            if (i < 0) {
//                break;
//            } else {
//                System.out.print(i);
//            }
//        }
//    }
}
