// Animal.java
public abstract class Animal {
    protected String species;
    protected int age;

    public Animal(Sring species,int age){
        this.species=species;
        thisa.age=age;
    }
    public abstract void sound();

    @Override
    public String toString{
        return "Species:"+species+",Age:"+age;
    }
    @Override
    public boolean equals(Object obj){

    }
}

// Bird.java
public class Bird extends Animal {
 private String featherColor;

 public Brid(String species,int age,String featherColor){
 super(species,age);
 this.featherColor=feathercolor;

}
public void sound(){
    System.out.println("The brid sound");
}
}
// Parrot.java
public class Parrot extends Bird {
private boolean canSpeack;
public Parrot(String species,int age,String featherColor,boolean canSpeack){
    super()

}
else{
    System.out.println("Parrod sound")
}
}

// Main.java
public class Main {
public static void main(String[] args) {
  Mummal line=new Mummal("Lion",5,"Grasslands");
    Brid eagle=new Brid("Eagle",3,"Brown");
    Parrot talkingParrot=new Parrot("Talking Parrot",2,"Green",true);

    System.out.println("Are lion and eagle equal?"+lion.equals(eagele));
    System.out.println("Are lion and lion equal?"+lion.equals(new Mammal("Lion",5,"Grasslands")));
}
}
