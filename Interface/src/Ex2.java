interface Dog{

  public  void bark();

}

interface Cat{

   public  void sleep();

}


class Animal implements Dog,Cat{

    public  void bark(){
        System.out.println("Dog is animal and it is barking");

    }


    public  void sleep(){
        System.out.println("Cat is animal and it is sleeping");

    }

}

class Test{

    public static void main(String[] args) {

        Animal animal=new Animal();

                animal.bark();
                animal.sleep();

    }

}