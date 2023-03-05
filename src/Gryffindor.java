import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String nameStudent, int age, int magicPower, int transgress,
                      int nobility, int honor, int bravery) {
        super(nameStudent, age, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндор! " + super.toString() + "\nБлагородство " + nobility + "\nчесть " + honor +
                "\nсмелость " + bravery;
    }

    public void compare(Gryffindor o) {
        int summThis = nobility + honor + bravery;
        int summO = o.bravery + o.honor + o.nobility;
        if (summThis > summO) {
            if (summThis > summO) {
                System.out.println(this.getNameStudent() + " лучший Гриффиндорец чем " + o.getNameStudent());
            } else if (summThis < summO) {
                System.out.println(o.getNameStudent() + " лучший Гриффиндорец чем " + this.getNameStudent());
            } else {
                System.out.println("Очки раны поэтмоу студенты считаются равными");
            }
        }
    }
}
