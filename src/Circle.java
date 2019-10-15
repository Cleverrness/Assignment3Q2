public class Circle extends Shape {
    public Circle(){
        this.shapeName = "Circle";
    }
    public void draw(){
        System.out.println("Drawing " + shapeName);
    }
    public void erase(){
        System.out.println("Erasing " + shapeName);
    }
}
