public class CharacterPyramid {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            for (char j = 'E'; j > i; j--) {
                System.out.print(" ");
            }

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }

            for (char j = (char)(i - 1); j >= 'A'; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}