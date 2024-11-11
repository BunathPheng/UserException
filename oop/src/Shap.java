public class Shap {
    public  void  printShap(){};
}
class Rectangle  extends  Shap {
    @Override
    public void printShap() {
        System.out.println("This is a rectangle");
    }
}
class Circle  extends  Rectangle {
    @Override
    public void printShap() {
        System.out.println("This is a circle");
    }
}

