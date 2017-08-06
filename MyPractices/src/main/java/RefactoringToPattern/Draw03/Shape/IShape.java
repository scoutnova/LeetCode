package RefactoringToPattern.Draw03.Shape;

//TODO 被多個類別複寫, 可以把這個類別改成interface或abstract class, 透過這樣的做法甚至也可以不需要type這個成員了
public interface IShape {
    void draw();
}
