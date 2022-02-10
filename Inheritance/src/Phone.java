

class Phone {

    String brand ="Samsung";
    void call(){

        System.out.println("Samsung old brand have call feature");
    }

}

class NewPhone extends  Phone {

    String model = "A50";
    void camera() {

        System.out.println("Samsung new brand model have camera feature");
    }

}


class Test{


    public static void main(String[] args) {

        NewPhone np = new NewPhone();

        System.out.println(np.brand);
        System.out.println(np.model);
        np.camera();
        np.call();
    }
}
