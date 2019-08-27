package com.btvn_buoi6.bai2;

public class Student {
    private  String id, name;
    private float score;

    public Student(String id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }
    public String toString(){
        String id_name_score= id+"_"+name+"_"+score;
        return id_name_score;
    }
}
