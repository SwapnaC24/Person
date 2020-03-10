package learn.programming;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        Person objectP1 = new Person();
        Person objectP2 = new Person();
        Person objectP3 = new Person();
        Person objectP4 = new Person();

        objectP1.setFirstName("Sairam");
        objectP1.setLastName("Srinivasan");
        objectP1.setAge(37);

        objectP2.setFirstName("Swapna");
        objectP2.setLastName("Chandramohan");
        objectP2.setAge(37);

        objectP3.setFirstName("Samhita");
        objectP3.setLastName("Sairam");
        objectP3.setAge(8);

        objectP4.setFirstName("Samanvita");
        objectP4.setLastName("Sairam");
        objectP4.setAge(5);

        System.out.println("********************************************************");

        System.out.println("                  My Family Members");

        System.out.println("********************************************************");

        System.out.println(objectP1.getFirstName()+" "+objectP1.getLastName()+" "+objectP1.getAge());
        System.out.println(objectP2.getFirstName()+" "+objectP2.getLastName()+" "+objectP2.getAge());
        System.out.println(objectP3.getFirstName()+" "+objectP3.getLastName()+" "+objectP3.getAge());
        System.out.println(objectP4.getFirstName()+" "+objectP4.getLastName()+" "+objectP4.getAge());
    }

}
