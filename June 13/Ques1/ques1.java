/*
*   A Static block is a block of code that is used for static initialization of a class.
    Important points for Static Block/Clause :
    - This block of code only executes once, i.e the first time you make an object of that 
      class or the first time you access a static member of that class (even if you never make an object of that class). 
    - Static Blocks are executed before the constructors
*/

class Demo{
    static int i;
    int j;

    Demo(){
        System.out.println("Inside the Demo Class !");
    }
    static{
        i = 20;
        System.out.println("This is the static block !");
    }

}
class staticBlocks{
    public static void main(String[] args){
        System.out.println(Demo.i);
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}