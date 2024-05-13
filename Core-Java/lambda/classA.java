package lambda;

public class classA {

    void show() {

        System.out.println("Implemention for lambda Expression ");
        InterfaceA x = ()-> System.out.println("Java is awesome");

        InterfaceB y =()->System.out.println("Addition:"+(p+q));

        InterfaceC z =(int m , int n )->
        {
            if(m>n){
                System.out.println("If block exeuted");
                return 100;

            }
            else
            {
                System.out.println("else block exeuted");
                return 200;

            }
        }

    };

    public static void main(String[] args) {
        classA obj = new classA();
        obj.show();
    }

}
