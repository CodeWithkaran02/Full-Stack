import java.util.Scanner;

public class pc {

    public static void main(String[] args) {
        System.out.println("Plase Enter the Input");
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String dna = sc.next();

            String complementaryDna = getComplementaryStrand(dna);
            System.out.println(complementaryDna);

        }

    }

    public static String getComplementaryStrand(String dna) {

        StringBuilder sb = new StringBuilder();

        for (char c : dna.toCharArray()) {
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

        System.out.println("==================");
        return sb.toString();

    }
}
