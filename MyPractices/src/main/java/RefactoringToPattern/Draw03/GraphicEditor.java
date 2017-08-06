package RefactoringToPattern.Draw03;

import RefactoringToPattern.Draw03.Shape.IShape;

//TODO 可以看到會有共用的Draw的動作, 這個動作會根據不同的類別而改變他的行為, 因此可以設定Interface, 並在它加入一個可複寫的function
public class GraphicEditor {
    private static GraphicEditor inst=null;
    public static GraphicEditor getInstance() {
        if (inst == null){
            inst = new GraphicEditor();
        }
        return inst;
    }
    //TODO 透過這個drawShape來判斷要執行drawCircle或drawRectangle, 因此可以使用擴展的方式來撰寫
    public void drawShape(IShape s) {
        s.draw();
    }
}