public class Shape {
    String shapeName;
    public Shape(){
        shapeName = "Line";
    }

    public void draw(){
        System.out.println("Drawing " + shapeName);
    }

    public void erase(){
        System.out.println("Erasing " + shapeName);
    }
}
