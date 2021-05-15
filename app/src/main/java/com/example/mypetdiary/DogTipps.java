package com.example.mypetdiary;

public class DogTipps {

    private String DogTippName;
    private String DogTipp;
    private int Thumbnail;



    public DogTipps(String name, String dogtipp, int thumbnail){

        DogTippName = name;
        DogTipp = dogtipp;
        Thumbnail = thumbnail;

    }


    public  String getDogTippName(){

        return DogTippName;
    }

    public String getDogTipp(){
        return DogTipp;
    }

    public int getThumbnail(){
        return Thumbnail;
    }
}