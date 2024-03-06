import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Hogwarts[] stydents = {
       /* Griffindor griffindor = new Griffindor();
        Griffindor harry = new Griffindor("Harry", "Potter", 100, 100, 100, 100, 100);
        Griffindor hermione = new Griffindor("Hermione", "Granger", 100, 100, 100, 100, 100);
*/
        Hogwarts[] stydents = new Hogwarts[]{
                new Griffindor("Harry", "Potter", 100, 100, 100, 100, 100),
                new Griffindor("Hermione", "Granger", 100, 100, 100, 100, 100),
                new Griffindor("Ron", "Weasley", 100, 100, 100, 100, 100),

                new Slytherin("Draco", "Malfoy", 100, 100, 100, 100, 100, 100, 100),
                new Slytherin("Graham", "Montague", 100, 100, 100, 100, 100, 100, 100),
                new Slytherin("Gregory", "Goyle", 100, 100, 100, 100, 100, 100, 100),

                new Kogtevran("Zhou", "Chang", 100, 100, 100, 100, 100, 100),
                new Kogtevran("Padma", "Patil", 100, 100, 100, 100, 100, 100),
                new Kogtevran("Marcus", "Belby", 100, 100, 100, 100, 100, 100),

                new Pyffendyi("Zachariah", "Smith", 100, 100, 100, 100, 100),
                new Pyffendyi("Cedric", "Diggory", 100, 100, 100, 100, 100),
                new Pyffendyi("Justin", "Finch-Fletchley", 100, 100, 100, 100, 100),
        };

        System.out.println("Количество учащихся " + stydents.length);
        for (int i = 0; i < stydents.length; i++) {
            Hogwarts hogwarts = stydents[i];
            System.out.println("Имя - " + hogwarts.getName() + "; Фамилия - " + hogwarts.getLastName() + "; Сила магии = "
                    + hogwarts.getPowerOfMagic());
            // System.out.println(Arrays.toString(stydents));
        }


    }
}