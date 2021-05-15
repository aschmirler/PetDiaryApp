package com.example.mypetdiary;

public class CatTipps {

    private String CatTippName;
    private String CatTipp;
    private int Thumbnail;



    public CatTipps(String name, String cattipp, int thumbnail){

        CatTippName = name;
        CatTipp = cattipp;
        Thumbnail = thumbnail;

    }


    public  String getCatTippName(){

        return CatTippName;
    }

    public String getCatTipp(){
        return CatTipp;
    }

    public int getThumbnail(){
        return Thumbnail;
    }
}