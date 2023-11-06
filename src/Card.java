  public class Card {

//    public Card(Kind kind, Value value) {
//        this.kind = kind;
//        this.value = value;
//    }

    enum Kind {CLOVER, HEAR, DIAMON, SPACE}
    enum Value {TWO, TREE, FOUR}

    Kind kind = Kind.CLOVER;

    void move(){
        switch (kind){
            case CLOVER :
                break;
            default:

        }
    }

}
