

interface Language{
    void getName(String name);
}

class ProgrammingLanguage implements Language {

    //abstract method implement

    public void getName(String name){
        System.out.println("Programming Language: " + name);
    }

}


class Test1{

    public static void main(String[] args) {

        ProgrammingLanguage lan=new ProgrammingLanguage();
        lan.getName("JAVA");

    }

}