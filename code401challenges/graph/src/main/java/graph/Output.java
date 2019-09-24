package graph;

public class Output {
    boolean isPossible;
    int value;

    public Output(boolean isPossible, int value) {
        this.isPossible = isPossible;
        this.value = value;
    }

    public boolean isPossible() {
        return isPossible;
    }

    public void setPossible(boolean possible) {
        isPossible = possible;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
