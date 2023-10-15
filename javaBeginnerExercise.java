public class javaBeginnerExercise {
    static void method0(String par0){ // "String par0" is a parameter for "method0"
        System.out.println(par0 + " :This is a static method"); // content of the "method0"
    }
    static int method1(int par1){ // "int par1" is a parameter for "method1"
        return 5 + par1; // content of the "method1"
    }
    static void method2(int par2){// "int par2" is a parameter for "method2"
        if(par2 < 18){
            System.out.println("You are still kid.");
        }else {
            System.out.println("You are an adult.");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Basics of Java language: Data Types");
            short var0 = 5;
            int var1 = 25;
            long var2 = -20;
        System.out.println("Short: " + var0 + " Interger: " + var1 + " Long: " + var2);
            float var3 = -1.e1f; // 'e' represents the no. of zeros(0), 'f' for float
            double var4 = 1.e2d; // 'e' represents the no. of zeros(0) 'd' for double
        System.out.println("Floating point: " + var3 + " Double: " + var4);
        String name0 = "hello", name1 = "HELLO";
            char name2 = 'O';
        System.out.println("String: " + name0 + " Character: " + name2);
        System.out.println("Operator: MATH ");
        System.out.println("MATH maximum value: " + var1 + " and " + var2 + " = " + Math.max(var1, var2) + " MATH minimum value: " + var1 + " and " + var2 + " = " + Math.min(var1, var2));
        System.out.println("MATH Square Root: " + var1 + " = " + Math.sqrt(var1) + " MATH Absolute(positive): " + var3 + " = " + Math.abs(var3));
        System.out.print("MATH random value: " + Math.random());// random no. 0.0 to 1.0
            int randomNum = (int)(Math.random() * 101);  // random no. 0 to 100
        System.out.println(" MATH random value(adjustable): " + randomNum);
            double wideCast0 = var1; // convert whole no. to decimals
            int narrowCast1 = (int) var3; // convert decimal no. to whole no.
        System.out.println("Widddening Casting: " + var1 + " = " + wideCast0 + " Narrowing Casting: " + var3 + " = " + narrowCast1);
        System.out.println("The Length of String: " + name0 + " = " + name0.length() + " Locate the 1st letter 'l' in: " + name0 + " = " + name0.indexOf('l'));// the indexOf() starts from zero(0)
        System.out.println("Uppercase Convert: " + name0 + " = " + name0.toUpperCase() + " Lowercase Convert: " + name1 + " = " + name1.toLowerCase());
        System.out.print("Concatenating Method 1: " + name0 + " + " + name1 + " = " + name0 + name1);
        System.out.println(" Concatenating Method 2: " + name0 + " + " + name1 + " = " + name0.concat(name1));
        method0("This is a Parameter");// prints the content of "method0"
        System.out.println( "This is a static methodd: " + method1(5));// the 5 is the value of "par1"
        method2(21);//prints the content of "if else", no. 21 is the value of "par2"
        String name3 = (randomNum < 50)? "This is below 50" : "This is above 50";// "short hand if...else statement"
        System.out.println(randomNum + " : " + name3);
        String[] cars = {"Mazda", "BMW", "Ford"};// array of cars
        System.out.println("This is the length of the array: " + cars.length);
            for (String loop0 : cars) { //loops through the array using "for each loop" and print the content from index 0 
        System.out.println("Loop 0: " + loop0);
            }for (int loop1 = 0; loop1 < cars.length; loop1++){// loops through the array using "for loop"
        System.out.println("Loop 1: " + cars[loop1]);
        }
            int[][] num0 = {{1, 2, 3,},{4, 5, 6,}};// this is a "multi dimensional array"
            for (int loop2 = 0; loop2 < num0.length; ++loop2) {
                for(int loop3 = 0; loop3 < num0[loop2].length; ++loop3) {
        System.out.println(num0[loop2][loop3]);
            }
          }





















    }
}
