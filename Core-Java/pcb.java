import java.util.Scanner;

public class pcb {

    public static void main(String[] args) {
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
            if (c == 'A') {
                sb.append('T');
            } else if (c == 'T') {
                sb.append('A');
            } else if (c == 'C') {
                sb.append('G');
            }
        }
    }
}
