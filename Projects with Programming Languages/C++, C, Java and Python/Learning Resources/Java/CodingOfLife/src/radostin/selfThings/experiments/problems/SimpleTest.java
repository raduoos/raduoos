package radostin.selfThings.experiments.problems;

public class SimpleTest {

    public static void main(String args[]) {
        String str = (String) returnStringAsArray()[-1 + 1 * 2];
        System.out.println(str);
    }

    public static Object[] returnStringAsArray() {
        return new String[] {
                "Java",
                "Quiz"
        };
    }
}