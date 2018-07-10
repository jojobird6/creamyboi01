///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dnd;
//
///**
// *
// * @author WongZ
// */
//public class RaceGenerator extends Stats{
//    private String race;
//    private int bonus;
//    private int RaceNumber;
//    
//    
//    //Setters
//    public void setRace(String Rce){
//        race=Rce;}
//    public void setBonus(int bon){
//        bonus=bon;}
//    public void setRaceNumber(int RaceNum){
//        RaceNumber=RaceNum;}
//    
//    //othermethods
//    public int RandomRace(){
//         int Me= (int)(Math.random()* 100 +1);
//        return Me;}
//    public String determineRace(){
//        int x= RandomRace();
//        if(x <20)
//            race="human";
//        if(x>=20 && x<30)
//            race="half-elf";
//        if(x>=30 && x<40)
//            race="halfling";
//        if(x>=40 && x<50)
//            race="Half-orc";
//        if(x>=50 && x<60)
//            race="Dwarvish";
//        if(x>=60 && x<70)
//            race="Elvish";
//        if(x>=70 && x<80)
//            race="gnomish";
//        if(x>=80 && x<90)
//            race="dragonborn";
//        if(x>=90 && x<100)
//            race="tiefling";
//      return race;
//    }
//    public String toString(){
//        String ret="My Race is " + race;
//        return ret;
//       
//    }  
//   
//}
