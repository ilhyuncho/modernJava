


enum Color {
    RED(1), GREEN(3);

    private final int value;
    Color(int value){       // 열거형의 생성자는 외부에서 호출 불가
        this.value=  value;
    }
    int getValue()
    {
        return value;
    }

    static void test(){

    };

}