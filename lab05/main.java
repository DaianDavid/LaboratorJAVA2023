package lab05;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

          /*Cat cat1 = new Cat("Luna", "neagra", 3);
        Cat cat2 = new Cat("Sasha", "alba", 2);
        Cat cat3 = new Cat("Rascov", "maro", 5);
        Cat cat4 = new Cat("Ramus", "neagra", 4);


        System.out.println("Cat name: "+ cat1.getName());
        System.out.println("Cat color: "+ cat1.getColor());
        System.out.println("Cat age: "+ cat1.getAge());

        cat1.feed();
        cat1.play();
        cat1.sleep();

        System.out.println("Cat name: "+ cat2.getName());
        System.out.println("Cat color: "+ cat2.getColor());
        System.out.println("Cat age: "+ cat2.getAge());

        cat1.feed();
        cat1.play();
        cat1.sleep();

        System.out.println("Cat name: "+ cat2.getName());
        System.out.println("Cat color: "+ cat2.getColor());
        System.out.println("Cat age: "+ cat2.getAge());

        cat1.feed();
        cat1.play();
        cat1.sleep();

        System.out.println("Cat name: "+ cat3.getName());
        System.out.println("Cat color: "+ cat3.getColor());
        System.out.println("Cat age: "+ cat3.getAge());

        cat1.feed();
        cat1.play();
        cat1.sleep();

        System.out.println("Cat name: "+ cat4.getName());
        System.out.println("Cat color: "+ cat4.getColor());
        System.out.println("Cat age: "+ cat4.getAge());

        cat1.feed();
        cat1.play();
        cat1.sleep();
*/

        Employer a = new Employer();
        Scanner input = new Scanner(System.in);

        System.out.println("Inroduceti datele angajatului");


        System.out.println("Introduceti numele angajatului: ");
        a.setName(input.nextLine());

        System.out.println("Introduceti emailul angajatului: ");
        a.setEmail(input.nextLine());

        System.out.println("Introduceti salarul pe ora al angajatului: ");
        a.setHourRate(input.nextInt());

        System.out.println("Introduceti numarul de ore lucrate ale angajatului: ");
        a.setCapacity(input.nextInt());

        System.out.println("Introduceti numarul de zile libere ale angajatului: ");
        a.setFreeDays(input.nextInt());


        a.calculateMonthlyIncome();


    }
}
