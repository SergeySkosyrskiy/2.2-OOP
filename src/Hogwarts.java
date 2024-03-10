public class Hogwarts {


    public void comparison(Griffindor student1, Griffindor student2, Griffindor student3) {
        int resultStudents1 = student1.getPowerOfMagic() + student1.getTransgressionDistance() + student1.getNobility() + student1.getHonor() + student1.getBravery();
        int resultStudents2 = student2.getPowerOfMagic() + student2.getTransgressionDistance() + student2.getNobility() + student2.getHonor() + student2.getBravery();
        int resultStudents3 = student3.getPowerOfMagic() + student3.getTransgressionDistance() + student3.getNobility() + student3.getHonor() + student3.getBravery();
        if (resultStudents1 > resultStudents2 && resultStudents1 > resultStudents3) {
            System.out.println(student1 + " лучший Гриффиндорец, чем " + student2 + " и " + student3);
        } else if (resultStudents2 > resultStudents1 && resultStudents2 > resultStudents3) {
            System.out.println(student2 + " лучший Гриффиндорец, чем " + student1 + " и " + student3);
        } else if (resultStudents3 > resultStudents1 && resultStudents3 > resultStudents2) {
            System.out.println(student3 + " лучший Гриффиндорец, чем " + student1 + " и " + student2);
        }
    }

        public void comparison (Slytherin student1, Slytherin student2,Slytherin student3){
            int resultStudents1 = student1.getPowerOfMagic() + student1.getTransgressionDistance() + student1.getDetermination() + student1.getCunning() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower();
            int resultStudents2 = student2.getPowerOfMagic() + student2.getTransgressionDistance() + student2.getDetermination() + student2.getCunning() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
            int resultStudents3 = student3.getPowerOfMagic() + student3.getTransgressionDistance() + student3.getDetermination() + student3.getCunning() + student3.getAmbition() + student3.getResourcefulness() + student3.getThirstForPower();
            if (resultStudents1 > resultStudents2 && resultStudents1 > resultStudents3) {
                System.out.println(student1 + " лучший Слизеринец, чем " + student2 + " и " + student3);
            } else if (resultStudents2 > resultStudents1 && resultStudents2 > resultStudents3) {
                System.out.println(student2 + " лучший Слизеринец, чем " + student1 + " и " + student3);
            } else if (resultStudents3 > resultStudents1 && resultStudents3 > resultStudents2) {
                System.out.println(student3 + "лучший Слизеринец, чем  " + student1 + " и " + student2);
            }
        }

        public void comparison (Kogtevran student1, Kogtevran student2,Kogtevran student3){
            int resultStudents1 = student1.getPowerOfMagic() + student1.getTransgressionDistance() + student1.getSmart() + student1.getFullOfCreativity() + student1.getWise() + student1.getWitty();
            int resultStudents2 = student2.getPowerOfMagic() + student2.getTransgressionDistance() + student2.getSmart() + student2.getFullOfCreativity() + student2.getWise() + student2.getWitty();
            int resultStudents3 = student3.getPowerOfMagic() + student3.getTransgressionDistance() + student3.getSmart() + student3.getFullOfCreativity() + student3.getWise() + student3.getWitty();
            if (resultStudents1 > resultStudents2 && resultStudents1 > resultStudents3) {
                System.out.println(student1 + " лучший Когтевранец, чем " + student2 + " и " + student3);
            } else if (resultStudents2 > resultStudents1 && resultStudents2 > resultStudents3) {
                System.out.println(student2 + " лучший Когтевранец, чем " + student1 + " и " + student3);
            } else if (resultStudents3 > resultStudents1 && resultStudents3 > resultStudents2) {
                System.out.println(student3 + " лучший Когтевранец, чем " + student1 + " и " + student2);
            }
        }

        public void comparison (Pyffendyi student1, Pyffendyi student2,Pyffendyi student3){
            int resultStudents1 = student1.getTransgressionDistance() + student1.getPowerOfMagic() + student1.getHardworking() + student1.getHonest() + student1.getLoyal();
            int resultStudents2 = student2.getTransgressionDistance() + student2.getPowerOfMagic() + student2.getHardworking() + student2.getHonest() + student2.getLoyal();
            int resultStudents3 = student3.getTransgressionDistance() + student3.getPowerOfMagic() + student3.getHardworking() + student3.getHonest() + student3.getLoyal();
            if (resultStudents1 > resultStudents2 && resultStudents1 > resultStudents3) {
                System.out.println(student1 + " лучший Пуффендец, чем " + student2 + " и " + student3);
            } else if (resultStudents2 > resultStudents1 && resultStudents2 > resultStudents3) {
                System.out.println(student2 + " лучший Пуффендец, чем " + student1 + " и " + student3);
            } else if (resultStudents3 > resultStudents1 && resultStudents3 > resultStudents2) {
                System.out.println(student3 + " лучший Пуффендец, чем " + student1 + " и " + student2);
            }

        }

        public void comparison (HogwartsStudents student1, HogwartsStudents student2){
            int resultStudents1 = student1.getPowerOfMagic() + student1.getTransgressionDistance();
            int resultStudents2 = student2.getPowerOfMagic() + student2.getTransgressionDistance();
            if (resultStudents1 > resultStudents2) {
                System.out.println(student1 + " обладает большей мощностью магии, чем " + student2);
            } else {
                System.out.println(student2 + " обладает большей мощностью магии, чем " + student1);
            }
        }


    }
