package RefactoringToPattern.Draw03;
import RefactoringToPattern.Draw03.Shape.Circle;
import RefactoringToPattern.Draw03.Shape.IShape;
import RefactoringToPattern.Draw03.Shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public void main(String[] args) {
        List<IShape> list = new ArrayList<>();
        list.add(new Rectangle());
        list.add(new Circle());
        for (IShape s : list) {
            GraphicEditor.getInstance().drawShape(s);
        }
    }
}