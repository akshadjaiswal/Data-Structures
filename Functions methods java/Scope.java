public class Scope {
    public static void main(String[] args) {
        int a = 10;//initialised outside the bloc
        int b = 20;
        String name = "Akshad";
        {
//            int a=20;//already initialised outside the block so you cant use here
            a = 25;//but you can modify the original value
            int c = 99;//values initialised in this block will remain unto inside the block
            name = "Mint";//you can reassign the original value
        }

        System.out.println(a);//you can only access  here in the main scope
        System.out.println(name);
//        System.out.println(c);//you can not use the variable inside the block scope outside the block
//        System.out.println(num);//You can't access num in this scope because it is defined in the method

        //Scoping of for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num = 90;
        }
//        System.out.println(num);//you cant use the variables inside the for loop to outside
//        System.out.println(i);//you cant use the variables inside the for loop to outside
    }

    static void random(int num) {
//        System.out.println(a);//you can not access here in method scope
        num = 24;
        System.out.println(num);//you can access num in this scope of a method
    }
}
