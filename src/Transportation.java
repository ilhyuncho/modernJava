
public enum Transportation {

    BUS(100) {
        int fare(int distance){
            return distance * BASIC_FAR;
        }
    },
    TRAIN(150) {int fare(int distance){ return distance * BASIC_FAR;}};

     protected final int BASIC_FAR;      // protected로 해야 각 상수에서 접근가능

    Transportation(int basicFare){
        BASIC_FAR = basicFare;
    }

    public int getBasicFare(){
        return BASIC_FAR;
    }
    abstract  int fare(int distance);
}
