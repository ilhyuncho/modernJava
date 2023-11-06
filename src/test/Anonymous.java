package test;


public class Anonymous {


    final int time = 40;

    public Person field = new Person(){
        @Override
        public void wake() {
            System.out.println("6시에 일어납니다" + time);
            work();
        }

        void work(){
            System.out.println("출근합니다");
        }
    };
    
    public void method1(){
        Person localVar = new Person(){
            @Override
            public void wake() {
                System.out.println("7시에 일어남");
                walk();
            }

            void walk(){
                System.out.println("산책합니다");
            }   
        };
        localVar.wake();
    }

    void method2(Person person){
        person.wake();
    }


}
