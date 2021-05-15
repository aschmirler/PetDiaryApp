package com.example.mypetdiary;

public class Trainings {

    private String TrainingName;
    private String Prerequisites;
    private String TrainingMethodTitle;
    private String Training;
    private int Thumbnail;



    public Trainings(String name, String prerequisites, String trainingMethodTitle,String training, int thumbnail){

        TrainingName = name;
        Prerequisites = prerequisites;
        TrainingMethodTitle = trainingMethodTitle;
        Training = training;
        Thumbnail = thumbnail;

    }


    public  String getTrainingName(){

        return TrainingName;
    }
    public String getPrerequisites(){
        return Prerequisites;
    }

    public String getTrainingMethodTitle(){
        return TrainingMethodTitle;
    }

    public String getTraining(){
        return Training;
    }

    public int getThumbnail(){
        return Thumbnail;
    }
}