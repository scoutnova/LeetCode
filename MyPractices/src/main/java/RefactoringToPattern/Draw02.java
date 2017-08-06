package RefactoringToPattern;

import java.util.ArrayList;
import java.util.List;

public class Draw02 {
    public class Sample {
        public void main(String[] args) {
            List<Shape> list = new ArrayList<>();
            list.add(new Rectangle());
            list.add(new Circle());
            for (Shape s : list) {
                //TODO 迴圈裏面每次都新增一個GraphicEditor會有負擔, 這裡要改
                new GraphicEditor().drawShape(s);
            }
        }
    }

    //TODO 被多個類別複寫, 可以把這個類別改成interface或abstract class, 透過這樣的做法甚至也可以不需要type這個成員了
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

    //TODO 可以看到會有共用的Draw的動作, 這個動作會根據不同的類別而改變他的行為, 因此可以設定Interface, 並在它加入一個可複寫的function
    class GraphicEditor {
        //TODO 透過這個drawShape來判斷要執行drawCircle或drawRectangle, 因此可以使用擴展的方式來撰寫
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
