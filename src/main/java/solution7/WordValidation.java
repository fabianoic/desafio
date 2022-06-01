package solution7;

import java.util.ArrayList;
import java.util.List;

public class WordValidation implements IWordValidation {

    @Override
    public String validWordperLetters(String inputWord) {
        List<String> letters = getLetterOnlyOnce(inputWord);
        String biggestWord = "";
        for (int firstLetter = 0; firstLetter < letters.size(); firstLetter++) {
            for (int secondLetter = firstLetter + 1; secondLetter < letters.size(); secondLetter++) {
                String word = "";
                boolean valid = true;
                boolean repeatedFirstLetter = false;
                boolean repeatedSecondLetter = false;
                Integer positionFirstLetter = inputWord.indexOf(letters.get(firstLetter), 0);
                Integer positionSecondLetter = inputWord.indexOf(letters.get(secondLetter), 0);
                do {
                    if ((positionFirstLetter != -1 && positionFirstLetter < positionSecondLetter) || positionSecondLetter == -1) {
                        word += inputWord.subSequence(positionFirstLetter, positionFirstLetter + 1);
                        positionFirstLetter = positionFirstLetter + 1;

                        if (repeatedFirstLetter) {
                            valid = false;
                            break;
                        }
                        repeatedFirstLetter = true;
                        repeatedSecondLetter = false;

                    } else if ((positionSecondLetter != -1 && positionSecondLetter < positionFirstLetter) || positionFirstLetter == -1) {
                        word += inputWord.subSequence(positionSecondLetter, positionSecondLetter + 1);
                        positionSecondLetter = positionSecondLetter + 1;

                        if (repeatedSecondLetter) {
                            valid = false;
                            break;
                        }
                        repeatedSecondLetter = true;
                        repeatedFirstLetter = false;
                    }
                    positionFirstLetter = positionFirstLetter == -1 ? -1 : inputWord.indexOf(letters.get(firstLetter), positionFirstLetter);
                    positionSecondLetter = positionSecondLetter == -1 ? -1 : inputWord.indexOf(letters.get(secondLetter), positionSecondLetter);

                } while (positionFirstLetter > -1 || positionSecondLetter > -1);

                if (valid && word.length() > biggestWord.length()) {
                    biggestWord = word;
                    continue;
                }
                if (repeatedFirstLetter) {
                    break;
                }
            }
        }
        return biggestWord;
    }

    private List<String> getLetterOnlyOnce(String stringToSeparete) {
        char[] separetadString = stringToSeparete.toCharArray();
        List<String> chars = new ArrayList<>();
        for (char letter : separetadString) {
            if (!chars.contains("" + letter)) {
                chars.add("" + letter);
                continue;
            }
        }
        return chars;
    }
}
