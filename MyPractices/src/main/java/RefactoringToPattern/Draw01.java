package RefactoringToPattern;

import java.util.ArrayList;
import java.util.List;

public class Draw01 {
    public class Sample {
        public void main(String[] args) {
            List<Shape> list = new ArrayList<>();
            list.add(new Rectangle());
            list.add(new Circle());
            for (Shape s : list) {
                new GraphicEditor().drawShape(s);
            }
        }
    }

    class Shape {
        int type;
    }

    class Rectangle extends Shape {
        Rectangle() {
            super.type = 1;
        }
    }

    class Circle extends Shape {
        Circle() {
            super.type = 2;
        }
    }

    class GraphicEditor {
        public void drawShape(Shape s) {
            if (s.type == 1)
                drawRectangle((Rectangle) s);
            else if (s.type == 2)
                drawCircle((Circle) s);
        }

        public void drawCircle(Circle r) {
            // drawCircle
        }

        public void drawRectangle(Rectangle r) {
            // drawRectangle
        }
    }
}
