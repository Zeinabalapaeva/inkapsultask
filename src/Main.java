import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university = new University("Zeinab", "Myrzaiym", "Nurlan", "Yntymak");
        for (String s : university.getStudentsName()) System.out.println(s);
    }
}
