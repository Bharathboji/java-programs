public class rectangle {
    int width;
    int height;
    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
    return width*height;
    }
    

    public static void main(String[] args) {
        rectangle r1=new rectangle(6,4);

        System.out.println("area rectangle is:" +r1.area());
    }

    
}
