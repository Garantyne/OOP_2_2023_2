public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String nameStudent, int age, int magicPower, int transgress,
                      int hardworking, int loyal, int honest){
        super(nameStudent, age, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String toString() {
        return "Факультет Пуффендуй! " + super.toString() +"\nТрудолюбие " + hardworking + "\nверность " + loyal +
                "\nчестность " + honest;
    }

    public boolean equals(Hufflepuff o) {
        int summThis = hardworking + loyal + honest;
        int summO = o.hardworking + o.loyal + o.honest;
        if(summThis > summO){
            return true;
        }else{
            return false;
        }
    }
}