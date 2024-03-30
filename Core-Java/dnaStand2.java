
public class dnaStand2 {
    public static String makeComplement(String dna) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (c == 'T') {
                builder.append('A');
            } else if (c == 'A') {
                builder.append('T');
            } else if (c == 'C') {
                builder.append('G');
            } else if (c == 'G') {
                builder.append('C');
            }
        }
        return builder.toString();
    }
}