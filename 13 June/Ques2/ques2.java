class Animal{
    public void Speak(){
        System.out.println("I'm an animal !");
    }
}

class Dog extends Animal{
    public void Speak(){
        System.out.println("Bow! Bow!");
    }
}

class Cat extends Animal{
    public void Speak(){
        System.out.println("Meeooowww !");
    }
}

class overridingFunctions{
    public static void main(String[] args){
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        a1.Speak();
        d1.Speak();
        c1.Speak();
    }
}