public class Main {
    public static void main(String[] args) {
    Pen p1 =new Pen();
    p1.setColor("orange");
        System.out.println(p1.getColor());
        p1.setTip(4);
        System.out.println(p1.getTip());
    Pen p2 = new Pen();
    p2.setColor("green");
        System.out.println(p2.getColor());
        p2.setTip(6);
        System.out.println(p2.getTip());
    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
    return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
    this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}