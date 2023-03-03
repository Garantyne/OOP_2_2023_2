public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String nameStudent, int age, int magicPower, int transgress,
                     int cunning, int determination, int ambition){
        super(nameStudent, age, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public String toString() {
        return "Факультет Слизерин! " + super.toString() +"\nХитрость " + cunning + "\nцелустремленность " + determination +
                "\nамбиции " + ambition;
    }

    public boolean equals(Slytherin o) {
        int summThis = cunning + determination + ambition;
        int summO = o.cunning + o.determination + o.ambition;
        if(summThis > summO){
            return true;
        }else{
            return false;
        }
    }
}