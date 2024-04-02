package ClassMethod;

public class test {
    }
    Class Demo{

    boolean equals1(test t1 , test t2){
            if(t1==t2)
            {
                return true;
            else
                return false;

            }

    public static void main(String args[]) {
        test t3 = new test();
        test t4 = new test();

        Demo d = new Demo();
        boolean b = d.equals(t3, t4);
        System.out.println(b);
    }
}}
