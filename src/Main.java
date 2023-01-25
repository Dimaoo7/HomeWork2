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




}



