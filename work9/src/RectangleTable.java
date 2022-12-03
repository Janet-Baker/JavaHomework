public class RectangleTable extends TableInfo {
    private int legs; //腿数
    private int rect; //类型
    private double len; //长
    private double width; //宽
    public RectangleTable(int legs, int rect, double len, double width){
        super(legs, rect);
        this.legs = legs;
        this.rect = rect;
        if (len>width) {
            this.len = len;
            this.width = width;
        } else {
            this.len = width;
            this.width = len;
        }
    }
    public void print(){
        System.out.print("Legs=");
        System.out.println(legs);
        System.out.print("Rect=");
        System.out.println(rect);
        System.out.print("Len=");
        System.out.print(len);
        System.out.print(",Width=");
        System.out.println(width);
    }
}
