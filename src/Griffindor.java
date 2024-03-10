public class Griffindor extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String lastName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, lastName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public String toString() {
        return getName() +
                getLastName();
    }
    public String toString1() {
        return getName() +getLastName() +
                getPowerOfMagic()+
                getTransgressionDistance()+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery
                ;
    }
}

