public class Slytherin extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String lastName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, lastName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public void printInfo(){
        System.out.println("Имя "+ getName()+"; Фамилия "+getLastName()+" Уровень трансгрессирации "+getTransgressionDistance()+"; Сила магии "+getPowerOfMagic()+"; Амбициозность ="+getAmbition()+"хитрость = "+ getCunning()+" ; решительность = "+ getDetermination()+"; жажда власти = "+ getThirstForPower());
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public String toString() {
        return getName() +
                getLastName();
    }

}
