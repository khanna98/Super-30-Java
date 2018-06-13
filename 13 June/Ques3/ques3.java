class overloadPrint{
    static void print(){
        System.out.println("Hi! I'm the null print.");
    }
    static void print(int a){
        System.out.println("Hi! I'm the print with " + a);
    }
    static void print(float b){
        System.out.println("Hi! I'm the print with " + b);
    }

    public static void main(String[] args){
        int num = 10;
        float num1 = 1.2f;
        // Now calling the all the print functions
        print();
        print(num);
        print(num1);
    }
}