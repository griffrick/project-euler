package barkle.garfin.number1;

public class Number1 {

    int value;

    public Number1(int upperBound){
        value = 0;
        for(int i = 0; i < upperBound; i++){
            if(i % 3 == 0 || i % 5 == 0){
                value += i;
            }
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
