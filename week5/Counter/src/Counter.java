public class Counter {
    int fieldValue;

    Counter (){
        this.fieldValue = 0;
    }

    Counter (int fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int add (int number) {
        fieldValue = fieldValue+number;
        return fieldValue;
    }

    public int get () {
        return fieldValue;
    }

    public void reset () {

    }
}
