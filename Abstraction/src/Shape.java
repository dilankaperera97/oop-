abstract class Shape {

     abstract void draw();

    public void color() {
        System.out.println("color shapes");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Draw Circle");
    }
}


class Rectangle extends Shape {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}


class Test {
    public static void main(String[] args) {
        Circle niceCircle = new Circle();
        niceCircle.draw();
        niceCircle.color();

        Rectangle niceRectangle = new Rectangle();
        niceRectangle.draw();
        niceRectangle.color();
    }
}