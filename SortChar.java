public class SortChar {
    public static void main(String[] args) {
        String input = "Sample Case";

        input = input.toLowerCase().replaceAll("\\s+", "");

        String vowelsCharacter = "aiueo";

        int[] count = new int[256];

        for(char letter : input.toCharArray()) {
            count[letter]++;
        }

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonant = new StringBuilder();

        for(char letter : input.toCharArray()) {
            while (count[letter] > 0) {
                if (vowelsCharacter.indexOf(letter) >= 0) {
                    vowels.append(letter);
                } else {
                    consonant.append(letter);
                }
                count[letter]--;
            }
        }
        
        System.out.println("Vowel Character: " + vowels.toString());
        System.out.println("Consonant Character: " + consonant.toString());
    }
}
