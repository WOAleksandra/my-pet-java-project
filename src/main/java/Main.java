import dataTypes.MyPet;

public class Main {

    public static void main(String[] args) {
        MyPet goldfish = new MyPet();

        goldfish.name = "Love.";
        goldfish.gender = "lady";
        goldfish.weight = 0.5f;
        goldfish.setAge = (3);
        goldfish.colour = "golden and orange.";
        goldfish.thanks = " Hope you are having a good and happy life as well.";

        System.out.println(goldfish.introduceMyPet());
    }
}
