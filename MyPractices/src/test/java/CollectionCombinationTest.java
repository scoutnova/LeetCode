import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CollectionCombinationTest {
    @Test
    public void collectionCombination() throws Exception {

        String[] inputCol01 = {"A", "B", "C"};
        String[] assertedOutputCols01 = {
                "AAA", "AAB", "AAC", "ABA", "ABB", "ABC", "ACA", "ACB", "ACC",
                "BAA", "BAB", "BAC", "BBA", "BBB", "BBC", "BCA", "BCB", "BCC",
                "CAA", "CAB", "CAC", "CBA", "CBB", "CBC", "CCA", "CCB", "CCC"
        };
        assertEquals(assertedOutputCols01, CollectionCombination.collectionCombination(inputCol01, 3));


        String[] inputCol02 = {"A", "B"};
        String[] assertedOutputCols02 = {
                "AAAAA","AAAAB","AAABA","AAABB","AABAA","AABAB","AABBA","AABBB","ABAAA","ABAAB","ABABA","ABABB","ABBAA","ABBAB","ABBBA","ABBBB",
                "BAAAA","BAAAB","BAABA","BAABB","BABAA","BABAB","BABBA","BABBB","BBAAA","BBAAB","BBABA","BBABB","BBBAA","BBBAB","BBBBA","BBBBB"
        };
        assertEquals(assertedOutputCols02, CollectionCombination.collectionCombination(inputCol02, 5));
    }
}
