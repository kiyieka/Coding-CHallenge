// Coding challenge 3
// Using boolean variables like if...then...else choices can be made.
// This code makes a choice to categorise an age based on the set conditions.

public class AgeCategory {
    int age;

    void category(){
        age = 17;
        if (age >= 18){
            System.out.println("You are an adult.");
        }else if (age >= 13){
            System.out.println("You are a teenager.");
        }else if (age >=5){
            System.out.println("You are a child.");
        }else {
            System.out.println("You are too young");
        }
    }
    public static void main(String[] args){
        AgeCategory child = new AgeCategory();
        child.category();
    }
}
