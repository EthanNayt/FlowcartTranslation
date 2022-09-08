import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String name;
       int age;
       int future_age;
       String music;

        Scanner input = new Scanner(System.in);

       System.out.println("Hello my name is Susan from Space!");
        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println("Hello" + name + "I am from the year 2210 and I am 20 years old.");
        System.out.println("How old are you?");
        age = input.nextInt();

        future_age = (age +(2210-2020));

        System.out.println("Wow, by 2210 you will be " + future_age + ", that is really old!");
        System.out.println("What music are you into?");

        Scanner musicInput = new Scanner(System.in);
        music = musicInput.nextLine();

        System.out.println("I have not heard of " + music);




    }
}
