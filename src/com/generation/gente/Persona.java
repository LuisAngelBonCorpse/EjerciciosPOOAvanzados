package com.generation.gente;

public class Persona {

    private String name;
    private int age;
    private String id;

    public Persona(String name, int age, String id ){
        setName(name);
        setAge(age);
        setId(id);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        if (age < 0){
            this.age = 0;
        }
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

