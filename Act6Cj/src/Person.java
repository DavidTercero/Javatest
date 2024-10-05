public class Person {
    private String name;
    private int age;
    private int identificador;
    private String campus;

    public Person(String name, int age, int identificador, String campus) {
        this.name = name;
        this.age = age;
        this.identificador = identificador;
        this.campus = campus;
    }

    public Person(String name, int identificador) {
        this.name = name;
        this.identificador = identificador;
    }

    public Person(String name, int age, int identificador) {
        this.name = name;
        this.age = age;
        this.identificador = identificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void displayInfo() {
        System.out.println("\nEl nombre es: " + name + " con id " + identificador);
        if (age > 0) {
            System.out.println("\tTiene " + age + " años");
        }
    }
}
