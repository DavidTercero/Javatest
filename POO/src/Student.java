public class Student extends Person {

    public static int[] grades;
    private static int average;

    public Student(String name, int age, int identificador, String campus, int[] grades) {
        super(name, age, identificador, campus);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public static double calculateAverage() {
        int suma = 0;
        for (int i = 0; i < grades.length; i++) {
            suma = suma + grades[i];
        }
        return (double) suma / grades.length;
    }

    public static char setFinalGrade() {
        if (average <= 50) {
            return 'F';
        } else if (average <= 60) {
            return 'E';
        } else if (average <= 70) {
            return 'D';
        } else if (average <= 80) {
            return 'C';
        } else if (average <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
        public static void studentInfo(){
            double average = calculateAverage();
            char finalGrade = setFinalGrade();
            System.out.println("Nombre: " + getName());
            System.out.println("Edad: " + getAge());
            System.out.println("Id: " + getIdentificador());

            for (int i = 0; i < grades.length; i++) {
                System.out.println("Calificación " + (i + 1) + ": " + grades[i]);
            }

            System.out.println("El promedio es: " + average);
            System.out.println("La calificación final es: " + finalGrade);
        }
}