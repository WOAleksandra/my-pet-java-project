package dataTypes;

public class MyPet {
    public int setAge;
    private int age;
    public String pet;
    public String name;
    public float weight;
    public String gender;
    public String colour;
    public String thanks;

    public String introduceMyPet(){
        return "Hey everyone, I am " + pet +
                " and my name is " + name +
                " My weight is " + weight + "kg. " +
                "I am a " + gender +
                " and I am " + setAge + " years old." +
                " \nMy colour is a nice mix between " + colour +
                " \nThank you for your attention." + thanks;
    }

    public void setAge(int ageToSet){
        age = ageToSet;
    }

}

