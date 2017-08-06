package ShipperQuestion;

/**
 * @author Scoutnova
 */
public class Merchandise {
    private int _length = 0;
    private int _width = 0;
    private int _height = 0;

    public Merchandise(int Length, int Width, int Height){
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

    public static boolean isMercFitInBox(Merchandise merc, Box box) {
        if (merc.getWidth() > box.getWidth())
            return false;
        if (merc.getHeight() > box.getHeight())
            return false;
        if (merc.getLength() > box.getLength())
            return false;
        return true;
    }
}
