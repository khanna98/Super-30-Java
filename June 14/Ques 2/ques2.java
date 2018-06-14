abstract class Animals{
    String nature,name;
    int age;
    void speak(){
        System.out.println("Hello, I'm an animal !");
    }
    abstract void food();
}

class Tiger extends Animals{
    Tiger(String nature,String name, int age){
        this.nature = nature;
        this.name = name;
        this.age = age;
    }
    
    void display(){
        System.out.println("Hi ! My name is " + this.name);
        System.out.println("I am " + this.age + " years old.");
        System.out.println("I am very " + this.nature + " in nature.");
    }

    void food(){
        System.out.println("I love eating flesh !");
    }
}

class aboutAnimal{
    public static void main(String[] args) {
        Animals a = new Tiger("Friendly","Sheru",12);
        Tiger t = new Tiger("Furious", "Richard Parker",20);

        t.display();
        a.food();
        a.speak();
    }
}