public class UncommonBugSolution {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                //Do not continue, increment and continue
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}