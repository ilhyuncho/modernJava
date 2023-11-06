


public class circle implements  Cloneable{
     Point p;
     double r;

     circle(Point p, double r){
         this.p = p;
         this.r = r;
     }

    public circle deepCopy(){

        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        circle  c = (circle)obj;
        c.p = new Point(this.p.x, this.p.y);

        return c;
    }

    public circle shallowCopy(){
         Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return (circle)obj;
    }

    @Override
    public String toString() {
        return "[p=" + p + ", r="+ r + "]";
    }
}
