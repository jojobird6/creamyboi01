
package dnd;


public class Stats  {
    private int strength;
    private int inteligence;
    private int dexterity;
    private int wisdom;
    private int constitution;
    private int charisma;
    private String type;
    private String race;
    private int totalbonus;
    
    public int getStr(){
        return strength;}
    public int getInt(){
        return inteligence;}
    public int getDex(){
        return dexterity;}
    public int getWis(){
        return wisdom;}
    public int getCons(){
        return constitution;}
    public int getChar(){
        return charisma;}
    public String getTyp(){
        return type;}
    public String getRace(){
        return race;}
    public int getBonus(){
        return totalbonus;}
    public void setStr(int Str){
        strength=Str;}
    public void setInt(int Int){
        inteligence=Int;}
    public void setDex(int Dex){
        dexterity=Dex;}
    public void setWis(int Wis){
        wisdom=Wis;}
    public void setCons(int Cons){
        constitution=Cons;}
    public void setChar(int Char){
        charisma=Char;}
    public void setType(String typ){
        type=typ;}
    public void setRace(String Rce){
        race=Rce;}
    public void setBonus(int Bonus){
        totalbonus=Bonus;}
    
    //Constructors
    public Stats (int myStr, int myInt, int myDex, int myWis, int myCons, int myChar){
        strength=myStr;
        inteligence=myInt;
        dexterity=myDex;
        wisdom=myWis;
        constitution=myCons;
        charisma=myChar;
        }
    public Stats(){
        strength=getRandoStats();
        inteligence=getRandoStats();
        dexterity=getRandoStats();
        wisdom=getRandoStats();
        constitution=getRandoStats();
        charisma=getRandoStats();
        
    }
    public int getRandoStats(){ 
        int[] rand={(int)(Math.random()*6+1),(int)(Math.random()*6+1),(int)(Math.random()*6+1),(int)(Math.random()*6+1)};
        int min = 10;
        int pos = 0;
        for(int x =0; x < rand.length; x++)
        {
            if (rand[x] < min)
            {
                min = rand[x];
                pos = x;
            }
        }
        rand[pos] = 0;
        int sum = 0;
        for (int x = 0; x < rand.length; x++)
        {
            sum += rand[x];
        }
        return sum;
    }
    
    public String getType(){
        if (strength > inteligence && wisdom >=10)
            type= "Fighter";
        else if( strength > inteligence && inteligence < 10)
            type= "Barbarian";
        return type;
    }
   
   
   //OOPS SORRY BUT LETS TRY THIS SHIT OUT 7/9/2018 ZACH WONG
    public int RandomRace(){
         int Me= (int)(Math.random()* 100 +1);
        return Me;}
    public String determineRace(String race1){
        int x= (int)(Math.random()* 100 +1);
        if(x <20)
            race="human";
        if(x>=20 && x<30)
            race="half-elf";
        if(x>=30 && x<40)
            race="halfling";
        if(x>=40 && x<50)
            race="Half-orc";
        if(x>=50 && x<60)
            race="Dwarvish";
        if(x>=60 && x<70)
            race="Elvish";
        if(x>=70 && x<80)
            race="gnomish";
        if(x>=80 && x<90)
            race="dragonborn";
        if(x>=90 && x<100)
            race="tiefling";
      return race;
    }
    
    public int addRaceBonus(int bonus1){
        int totalbonus=0;
        if(race.equals("Half-orc")){
            strength+=2;
            constitution+=1;
            totalbonus=3;
        }
        if(race.equals("Elvish")){
            dexterity+=2;
            totalbonus=2;
        }
        if (race.equals("human")){
            strength+=1;
            dexterity+=1;
            inteligence+=1;
            constitution+=1;
            charisma+=1;
            wisdom+=1;
            totalbonus=6;
        }
        if (race.equals("gnomish")){
            inteligence+=2;
            totalbonus=2;
        }
        if(race.equals("Dwarvish")){
            constitution+=2;
            totalbonus=2;
        }
        if(race.equals("halfling")){
            dexterity+=2;
            totalbonus=2;
        }
        if(race.equals("dragonborn")){
            charisma+=1;
            strength+=2;
            totalbonus=3;
        }
        
        
        
        return totalbonus;
        
    }
    public String toString(){
       String ret= "My Strength is " + strength +" My inteligence is " + inteligence + " My dexterity is " + dexterity + " My wisdom is " + wisdom + " My constittution is " + constitution + " My charisma is " + charisma;
       String acc= ", My race is " + determineRace(race) + ", My total Stat bonus is " + addRaceBonus(totalbonus);
       return ret+acc;
   }
       
      
   
}
