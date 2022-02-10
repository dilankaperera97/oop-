public class Enc1 {

    private int ID;
    private String Name;
    private int Age;


    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }


    public void setAge(int Age) {
        this.Age = Age;

    }

    public int getAge() {
        return Age;
    }


    public class Main {

        public static void main(String[] args) {

            Enc1 s = new Enc1();

            s.setID(975522016);
            s.setName("Dilanka");
            s.setAge(24);

            System.out.println(s.getID() + " " + s.getName() + " " + s.getAge());


        }

    }
}



