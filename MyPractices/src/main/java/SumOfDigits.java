public class SumOfDigits {
    public static int sumOfDigit(int input) {
        int sum = 0;
        //使用while迴圈將每個數字取出並加總
        while (input != 0) {
            sum += input % 10;
            input = input / 10;
        }
        return sum;
    }
}
