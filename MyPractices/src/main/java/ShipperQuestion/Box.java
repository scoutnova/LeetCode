package ShipperQuestion;

/**
 * @author Scoutnova
 */
//TODO 5 箱子還會不會有其他的屬性?
public class Box {
    private int _length = 0;
    private int _width = 0;
    private int _height = 0;

    public Box(int Length, int Width, int Height){
        this._length = Length;
        this._width = Width;
        this._height = Height;
    }

    public int getLength(){
        return _length;
    }

    public int getWidth(){
        return _width;
    }

    public int getHeight(){
        return _height;
    }

}
