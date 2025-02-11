package model;

public class Space {

    private Integer value;
    private final int expectedValue;
    private final boolean fixed;

    public Space(int expectedValue, boolean fixed) {
        this.expectedValue = expectedValue;
        this.fixed = fixed;
        if(fixed){
            value = expectedValue;
        }
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        if(fixed) return;
        this.value = value;
    }

    public void clearSpace(){
        setValue(null);
    }

    public int getExpectedValue() {
        return expectedValue;
    }

    public boolean isFixed() {
        return fixed;
    }
}
