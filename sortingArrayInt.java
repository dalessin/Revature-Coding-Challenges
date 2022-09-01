
//ran out of time; spent half the time distracted by syntax error

public class sortingArrayInt {

    public void method() {

        // spent 15 minutes trying to fix this red line
        int[] intArray = new int[]{5,8,123,6};

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int placeHolder = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = placeHolder;
                }
            }
        }
    }
}