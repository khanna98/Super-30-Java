interface Animals{
    void speak();
    void eat();

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.speak();
        c.speak();
        d.eat();
        d.eat();
    }
}

class Dog implements Animals{
    public void speak(){
        System.out.println("Bow ! Bow !");
    }
    public void eat(){
        System.out.println("I am eating dog food !");
    }
}

class Cat implements Animals{
    public void speak(){
        System.out.println("Meeooowwww!");
    }
    public void eat(){
        System.out.println("I am eating fish !");
    }
}
