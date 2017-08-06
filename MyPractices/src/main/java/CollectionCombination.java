import java.util.Arrays;

public class CollectionCombination {
    public static String[] collectionCombination(String[] col, int length){
        //初始化陣列的大小, 為元素總長度的輸出長度次方
        String[] allLists = new String[(int)Math.pow(col.length, length)];

        //如果長度為1, 直接回傳Collection為子集
        if (length == 1) {
            return col;
        } else {
            //建立子集, 在子集前使用for迴圈加入各個元素, 並用遞迴處理子集
            String[] subLists = collectionCombination(col, length - 1);

            //把元素加進去子集的首位(最左邊)
            int arrIndex = 0;
            for (String elem:col) {
                for (String subList:subLists) {
                    allLists[arrIndex] = elem + subList;
                    arrIndex++;
                }
            }
            return allLists;
        }
    }
}
