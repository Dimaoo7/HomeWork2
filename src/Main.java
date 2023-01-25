public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task12();
        task13();
        task14();
        task15();
        task16();
    }

        //Первая задача
        public static void task1 () {

            System.out.println("Задача 1");
            float dog = 8.0F;
            System.out.println(dog);

            float cat = 3.6F;
            System.out.println(cat);

            int paper = 763789;
            System.out.println(paper);
        }

        //Второя задача

        public static void task2 () {

            System.out.println("Задача 2");
            float dog = 8.0F;
            dog = dog + 4;
            System.out.println(dog);

            float cat = 3.6F;
            cat = cat + 4;
            System.out.println(cat);

            int paper = 763789;
            paper = paper + 4;
            System.out.println(paper);
        }

        // Третья задача

        public static void task3 () {

            System.out.println("Задача 3");
            float dog = 8.0F;
            dog = dog - 3.5F;
            System.out.println(dog);

            float cat = 3.6F;
            cat = cat - 1.6F;
            System.out.println(cat);

            int paper = 7637890;
            paper = paper - 7639;
            System.out.println(paper);
        }


        //Четвертая задача

        public static void task4 () {

            System.out.println("Задача 4");
            float friend = 19;
            System.out.println(friend);

            friend = friend + 2;
            System.out.println(friend);

            friend = friend / 7;
            System.out.println(friend);
        }

        //Пятая задача

        public static void task5 () {

            System.out.println("Задача 5");
            float frog = 3.5F;
            System.out.println(frog);

            frog = frog * 10;
            System.out.println(frog);

            frog = frog / 3.5F;
            System.out.println(frog);

            frog = frog + 4;
            System.out.println(frog);
        }

        //Шестая задача

        public static void task6 () {

            System.out.println("Задача 6");
            float firstBoxer = 78.2F;

            float secondBoxer = 82.7F;
            System.out.println(firstBoxer + secondBoxer);

            float difference = secondBoxer - firstBoxer;
            System.out.println(difference); // Не хотел ее печатать но интел сказал,нада ее использовать!!
        }

        // Седьмая задача

        public static void task7 () {

            System.out.println("Задача 7");
            float secondBoxer = 82.7F;

            float firstBoxer = 78.2F;

            float difference = secondBoxer % firstBoxer;

            System.out.println(difference);
        }

        // Восьмая задача

        public static void task8 () {
            System.out.println("Задача 8");


        short hoursOfWork = 640;
        byte everyEmployee = 8;

        var people = hoursOfWork / everyEmployee;

        System.out.println("Всего: " + people + " человек");

        people = people + 94;

        int sumOfWork = people * everyEmployee;

        System.out.println("Если в компании работает: " + people + " человека, то всего: " + sumOfWork + " часов работы может быть поделено между сотрудниками");
        }

        /*Перменные часть 2 начало
        * Первая задача*/

        public static void task9 () {
            System.out.println("Задача 9");

            int caramelCase = 500000;
            System.out.println(caramelCase);

            byte oneByte = 120;
            System.out.println(oneByte);

            short butSmart = 7000;
            System.out.println(butSmart);

            long butStupid = 2200200;
            System.out.println(butStupid);

            float sTochkoj = 20.500500F;
            System.out.println(sTochkoj);

            double theBoss = 77.9994929999;
            System.out.println(theBoss);


        }
         //Вторая задача

        public static void task10 () {
            System.out.println("Задача 10");

            float frst = 27.12F;
            System.out.println(frst);

            long veryLong = 987678965549L;
            System.out.println(veryLong);

            short rllyShort = 2_786;
            System.out.println(rllyShort);

            short again = 569;
            System.out.println(again);

            short againn = -159;
            System.out.println(againn);

            short snovaEmae = 27897;
            System.out.println(snovaEmae);

            byte bit = 67;
            System.out.println(bit);

        }
        // Третья задача
        public static void task11 () {

        System.out.println("Задача 11");

        byte u_Luda = 23;
        byte u_Anna = 27;
        byte u_Katja = 30;

        short listochki = 480;

        int vsehUcenikov = u_Katja + u_Anna + u_Luda;
        int vsego = listochki / vsehUcenikov;

        System.out.println("На каждого ученика рассчитано: " + vsego + " листов бумаги");

    }
        //Четвертая задача
        public static void task12 () {

        System.out.println("Задача 12");
        byte butilki = 16 / 2;
        System.out.println( butilki + " Бутылок в минуту");

        int first = 20 * butilki;
        System.out.println("За 20 минут машина произвела "+ first +" штук бутылок");

        int second = 1440 * butilki;
        System.out.println("За 1 день машина произвела "+ second +" штук бутылок");

        int third = 4320 * butilki;
        System.out.println("За 3 дня машина произвела "+ third +" штук бутылок");

        int fourth = 43800 * butilki;
        System.out.println("За 1 месяц машина произвела "+ fourth +" штук бутылок");
    }
        //Пятая задача
        public static void task13 () {

        System.out.println("Задача 13");

        byte white = 2;
        byte brown = 4;
        int summa = white + brown;
        byte kraska = 120;
        int klassov = kraska / summa;
        int itogo = white * summa;
        System.out.println( itogo);

        int itog = brown * summa ;
        System.out.println(itog);

        System.out.println("В школе, где "+klassov+" классов, нужно " +itogo+ " банок белой краски и " +itog+ " банок коричневой краски");
    }
        // Шестая задача
        public static void task14 () {

        System.out.println("Задача 14");

        short banana = 80 * 5;

        short milk = 105 * 2;

        short iceCream = 100 * 2;

        short eggs =  70 * 4;
        int weight = banana + milk + iceCream + eggs;
        System.out.println("В таком завтраке " +weight+" грамм");
        System.out.println("В килограммах это 1.09"); //интел почему то не выводит больше одного нуля после запятой

    }
        // Седьмая задача
        public static void task15 () {
        System.out.println("Задача 15");

        int esli250 = 7000 / 250;
        int esli500 = 7000 / 500;
        System.out.println("Если 250 грамм каждый день то "+esli250+" дней");
        System.out.println("Если 500 грамм каждый день то "+esli500+" дней");
    }
        //Восьмая задача
        public static void task16 () {

        System.out.println("Задача 16");
        int masha = 67_760 + 6776; // перед 813 120 после 894 432
        int denis = 83_690 + 8369; // перед 1 004 280   после 1 104 708
        int kristina = 76230 + 7623; // перед 914 760   после 1 006 236

       int raznica_Masha = 81_312;
       int raznica_Denis = 100_428;
       int raznica_Kristina = 91_476;

        System.out.println("Зарплата Маши после увеличения на 10% "+masha);
        System.out.println("Зарплата Дениса после увеличения на 10% "+denis);
        System.out.println("Зарплата Кристины после увеличения на 10% "+kristina);

        System.out.println("Разница годового дохода у Маши " + raznica_Masha);
        System.out.println("Разница годового дохода у Дениса " + raznica_Denis);
        System.out.println("Разница годового дохода у Кристины " + raznica_Kristina);

    }
}


