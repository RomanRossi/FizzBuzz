package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
    public static int reduce(int num) {
        int current = num;
        int steps = 0;
        while (current > 0) {
            if (current % 2 == 0) {
                current /= 2;
            }
            else {
                current -= 1;
            }
            steps++;
        }
        return steps;
    }
}
