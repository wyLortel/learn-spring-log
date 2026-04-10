package ding.co.hellospring;

public class User {
    private String name;
    private int age;
    private Long id;

    public User(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
