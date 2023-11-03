import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String[] sabaktar;

    public Student() {
    }

    public Student(String name, String surname, int age, String[] sabaktar) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sabaktar = sabaktar;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSabaktar() {
        return Arrays.toString(sabaktar);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSabaktar(String[] sabaktar) {
        this.sabaktar = sabaktar;
    }

    public void showInfo() {
        System.out.println(" name = " + name);
        System.out.println("surName = " + surname);
        System.out.println("age = " + age);
        System.out.println(" sabartar = " +Arrays.toString(sabaktar));
    }
}






