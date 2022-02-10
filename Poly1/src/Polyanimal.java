public class Polyanimal {

    void eat() {
        System.out.println("Eat");
    }

  //  void eat(String food) {
        //System.out.println("Eating " + food);
    //}
}



//overriding
class cat extends Polyanimal {

    void eat() {
        System.out.println("Cat is eat bread");

    }
}

class dog extends Polyanimal {

    void eat() {
        System.out.println("Dog is eat meat");

    }
}

class rabbit extends Polyanimal {

    void eat() {
        System.out.println("Rabbit is eat Carrot");

    }
}


class Test {

    public static void main(String[] args) {

       // Polyanimal myanimal = new Polyanimal();


        Polyanimal mycat = new cat();

        Polyanimal mydog = new dog();

        Polyanimal myrabbit = new rabbit();

       // myanimal.eat();
        mycat.eat();
        mydog.eat();
        myrabbit.eat();

    }}


