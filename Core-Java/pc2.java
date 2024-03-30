import java.util.Scanner;

public class pc2 {

    public static void main(String[] args) {
        System.out.println("Plase Enter the Input");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        while (i-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            String s = getComplementaryStrand(str);
            System.out.println(s);

        }

    }

    public static String getComplementaryStrand(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            switch (c) {
                case 'A':
                    sb.append('T');
                    break;
                case 'T':
                    sb.append('A');
                    break;
                case 'C':
                    sb.append('G');
                    break;
                case 'G':
                    sb.append('C');
                    break;
                default:
                    break;
            }
        }

        return sb.toString();
    }
}
