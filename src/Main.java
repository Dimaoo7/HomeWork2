import java.net.SocketOption;

public class Main {

    public static void main(String[] args) {

        var cookies = 10;
        System.out.println(cookies);

        cookies = cookies + 3;
        System.out.println(cookies);

        cookies = cookies * 5;
        System.out.println(cookies);

        System.out.println("Process has been finished");

        //Первая задача
        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        //Второя задача

        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        // Третья задача

        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        //Четвертая задача

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //Пятая задача

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //Шестая задача

        var firstBoxer = 78.2;

        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);

        var difference = secondBoxer - firstBoxer;

        // Седьмая задача

        difference = secondBoxer % firstBoxer;
        System.out.println(difference);

        // Восьмая задача

        var hoursOfWork = 640;
        var everyEmployee = 8;

        var people = hoursOfWork / everyEmployee;

        System.out.println("Всего: " + people + " человек");

        people = people + 94;

        var sumOfWork = people * everyEmployee;

        System.out.println("Если в компании работает: " + people + " человека, то всего: " + sumOfWork + " часов работы может быть поделено между сотрудниками");

    }
}
