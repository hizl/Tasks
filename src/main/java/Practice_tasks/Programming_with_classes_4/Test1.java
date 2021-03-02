package Practice_tasks.Programming_with_classes_4;

public class Test1 {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getVariables() {
        getA();
        getB();
    }

    public void setVariables(int n1, int n2) {
        setA(n1);
        setB(n2);
    }

    public int summingNumbers() {
        return getA() + getB();

    }

    public int searchMaxNumber() {
        return Math.max(getA(), getB());
    }

}
