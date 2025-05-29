package chapter9;

public class Person {

    private String name;
    private int age;
    private String gender;
    public String getName() {
        return name;
    }
//  public Person(){
//        System.out.println("In Person's default constructor");
//    }

//    public Person( String name){
//        System.out.println("In Person's 2nd constructor. Name is set");
//    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





}
