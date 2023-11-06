


class Juice{
    String name;

    Juice(String name) {this.name = name + "Juice"; }
    public String toString() {return name;}
}
public class Juicer {

    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for(Fruit f : box.getList())
            tmp += f.toString() + " ";
        return new Juice(tmp);
    }

    static <T extends Fruit> Juice makeJuice1(FruitBox<T> box){

        String tmp = "";
        for(Fruit f : box.getList())
            tmp += f.toString() + " ";
        return new Juice(tmp);
    }
}
