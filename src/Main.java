import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Hogwarts hogwarts = new Hogwarts();
        Griffindor griffindor1 = new Griffindor("Harry", " Potter", 56, 56, 56, 56, 56);
        Griffindor griffindor2 = new Griffindor("Hermione", " Granger", 60, 60, 60, 60, 60);
        Griffindor griffindor3 = new Griffindor("Ron", " Weasley", 70, 70, 70, 70, 70);

        Slytherin slytherin1 = new Slytherin("Draco", " Malfoy", 60, 60, 60, 60, 60, 60, 60);
        Slytherin slytherin2 = new Slytherin("Graham", " Montague", 71, 71, 71, 71, 71, 71, 71);
        Slytherin slytherin3 = new Slytherin("Gregory", " Goyle", 72, 72, 72, 72, 72, 72, 72);

        Kogtevran kogtevran1 = new Kogtevran("Zhou", " Chang", 15, 15, 15, 15, 15, 15);
        Kogtevran kogtevran2 = new Kogtevran("Padma", " Patil", 16, 16, 16, 16, 16, 16);
        Kogtevran kogtevran3 = new Kogtevran("Marcus", " Belby", 17, 17, 17, 17, 17, 17);

        Pyffendyi pyffendyi1 = new Pyffendyi("Zachariah", " Smith", 20, 20, 20, 20, 20);
        Pyffendyi pyffendyi2 = new Pyffendyi("Cedric", " Diggory", 30, 30, 30, 30, 30);
        Pyffendyi pyffendyi3 = new Pyffendyi("Justin", " Finch-Fletchley", 40, 40, 40, 40, 40);

//Сделайте метод, который выводит на экран описание студента.
        slytherin3.printInfo();
        //  Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета
        hogwarts.comparison(griffindor1, griffindor2,griffindor3);
        hogwarts.comparison(slytherin1, slytherin2,slytherin3);
        hogwarts.comparison(kogtevran1, kogtevran2,kogtevran3);
        hogwarts.comparison(pyffendyi1, pyffendyi2,pyffendyi3);
        //Реализуйте метод, который сравнивает двух любых учеников Хогвартса
        hogwarts.comparison(pyffendyi1, slytherin2);





    }
}