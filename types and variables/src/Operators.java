public class Operators {
    public static void main(String[] args) throws Exception {
        int sum = 1 + 2;
        int sub = 1 - 2;
        int mult = 1 * 2;
        double div = 1 / 2;

        String concat = "First " + "Seconds "; //
        concat += 1 + 2 + (3 + "1") + (1 + 1) + "1";
        System.out.println(concat);

        System.out.println(--sum);
        System.out.println(++sum);

        boolean isSad = true;
        
        System.out.println(!isSad);
        System.out.println( true && false);
        System.out.println( true && true);
        System.out.println( true || false);
        System.out.println( false || false);

        System.out.println(sum == sub);
        System.out.println( sum != sub);
        System.out.println( mult > div); // >=
        System.out.println( mult < div); // <=

        if (sum > sub) {
            System.out.println(1);    
        } else {
            System.out.println(0);
        }

        String firstName = "Victor";
        String secondName = new String("Victor");

        System.out.println(firstName == secondName);
        System.out.println(firstName.equals(secondName));

        System.out.println(sum != sub ? 1 : 0);

    }
}
