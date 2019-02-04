package codility;

public class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int finalNumber = 0;
        int initialNumber = 0;

        for (int i = 0; i < (binary.length() - 1); i++) {
            while (binary.charAt(i) == '0' && i < binary.length() - 1) {
                i++;
                initialNumber++;
            }
            if (initialNumber > finalNumber && binary.charAt(i) == '1') {
                finalNumber = initialNumber;
            }
            initialNumber = 0;

        } return finalNumber;
    }


    public static void main(String[] args) {
        BinaryGap  gap = new BinaryGap();
        System.out.println(gap.solution(32));

    }

}
