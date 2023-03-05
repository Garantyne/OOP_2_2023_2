public class Main {
    public static void main(String[] args) {
        Gryffindor garry = new Gryffindor("Гарри поттер",12,30,50,50,50,50);
        System.out.println(garry.toString());
        Hufflepuff zakh = new Hufflepuff("Захария Смит",12,1,233,15,16,17);
        System.out.println(zakh.toString());
        Ravenclaw palum = new Ravenclaw("Палумна Лавгуд",13,26,273,13,16,13);
        System.out.println(palum.toString());
        Slytherin malf = new Slytherin("Драко Малфой",12,12,433,20,34,99);
        System.out.println(malf.toString());
        Gryffindor ron = new Gryffindor("Рон Уизли",12,10,20,40,40,40);
        System.out.println(garry.toString());

        garry.compare(ron);
        garry.compare(malf);


    }
}