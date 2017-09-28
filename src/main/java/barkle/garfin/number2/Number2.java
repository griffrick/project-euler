package barkle.garfin.number2;

public class Number2 {

    private int value;


    public Number2(int upperLimit) {
        value = getFib(2, 3, 2, upperLimit);
    }

    private int getFib(int currFib, int currFibSum, int currAnswerSum, int upperLimit) {
        if(currFibSum < upperLimit) {
            if(currFibSum % 2 == 0){
                currAnswerSum += currFibSum;
            }
            int nextCurrFib = currFibSum;
            int nextCurrVal = currFibSum + currFib;
            return getFib(nextCurrFib, nextCurrVal, currAnswerSum, upperLimit);
        } else {
            return currAnswerSum;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
