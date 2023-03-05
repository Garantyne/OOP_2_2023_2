import java.util.Objects;

public class Hogwarts {
    private String nameStudent;
    private int age;
    private int magicPower;
    private int transgress;

    public Hogwarts() {
        nameStudent = "unknow";
        age = 0;
        magicPower = 0;
        transgress = 0;

    }

    public Hogwarts(String nameStudent, int age, int magicPower, int transgress) {
        this.nameStudent = nameStudent;
        this.age = age;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 || age < 7) {
            System.out.println("Введен неверный возраст");
        } else {
            this.age = age;
        }
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 1 || magicPower > 100) {
            System.out.println("Введены некорректные данные");
        } else {
            this.magicPower = magicPower;
        }
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress < 1) {
            System.out.println("Введены некорректные данные");
        } else {
            this.transgress = transgress;
        }
    }

    @Override
    public String toString() {
        return "Имя студента " + nameStudent + " возраст студента " + age + " лет " + " магическая сила - " + magicPower +
                " может трансгрессировать на " + transgress + " метров ";
    }


    public void compare(Hogwarts o) {
        int summThis = magicPower + transgress;
        int summO = o.magicPower + o.transgress;

        if (summThis > summO) {
                System.out.println(this.getNameStudent() + " лучший студент чем " + o.getNameStudent());
        } else if (summThis < summO) {
                System.out.println(o.getNameStudent() + " лучший студент чем " + this.getNameStudent());
        } else {
                System.out.println("Очки раны поэтмоу студенты считаются равными");
        }
    }
}
