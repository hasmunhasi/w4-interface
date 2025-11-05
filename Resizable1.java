 
package resizable1;
 interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}


class Rectangle implements Resizable {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width) {
        this.width = width;
    }
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
public class  Resizable1{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(520, 850);
        rectangle.printSize();
        rectangle.resizeWidth(440);
        rectangle.resizeHeight(380);
        rectangle.printSize();
    }
}
 