package exercise;

import java.util.Date;

public class ExercisesOne {
    
    int storeage(String s)
    {
        return s.length() * 2;
    }

    static int i = 0;
    
    public static void main(String[] args)
    {
        One one = new One();
        System.out.println(one.a);
        System.out.println(one.ch);

        HelloWorld helloworld = new HelloWorld(4);

        ATypeName a = new ATypeName();

        DataOnly data = new DataOnly();

        data.i = 99;
        data.b = true;
        data.d = 99.99;

        System.out.println(" data.i = " + data.i);
        System.out.println(" data.b = " + data.b);
        System.out.println(" data.d = " + data.d);


        ExercisesOne exerciseOne = new ExercisesOne();
        System.out.println(exerciseOne.storeage("four"));

        Incrementable test = new Incrementable();
        test.increment();
        Incrementable.increment(); // !!!!!!!!!!!!! 
        System.out.println(" After call class with member and class initizlier with member: " + exerciseOne.i);
        System.out.println("-------");
        Incrementable test1 = new Incrementable();
        test1.increment();
        System.out.println(exerciseOne.i);
        ExercisesOne exerciseOne1 = new ExercisesOne();
        System.out.println(exerciseOne1.i);        
        System.out.println("-------");


        int i = 1;
        Integer I;
        I = i;
        System.out.println(I);
        System.out.println("-------");

        boolean b = true;
        Boolean B = b;
        System.out.println(B);
        System.out.println("-------");

        char ch = 'c';
        Character Ch = ch;
        System.out.println(Ch);
        System.out.println("-------");

        byte by = 3;
        Byte By;
        By = by;
        System.out.println(By);
        System.out.println("-------");

        short sh = 4;
        Short Sh;
        Sh = sh;
        System.out.println(Sh);
        System.out.println("-------");

        long l = 5;
        Long L;
        L = l;
        System.out.println(L);
        System.out.println("-------");

        float f = (float) 1.1;
        Float F;
        F = f;
        System.out.println(F);
        System.out.println("-------");

        double d = 1.2;
        Double D;
        D = d;
        System.out.println(D);
        System.out.println("-------");
    }

}