public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 0; i <= 6; i++) {
            if(i == 2) continue; // jump over num 2
            if(i == 4) break; // break before reach num 4

            System.out.println(i);
        }
    }
}
