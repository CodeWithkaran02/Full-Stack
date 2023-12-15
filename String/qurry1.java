public class qurry1 {
    public String helloName(String name) {
        // String helloName = "Bob!";
        System.out.println(name.concat(" Bob!"));
        return name;

        // return " Hello ".concat(name).concat("!");
        // return "Hello "+name+"!";
        // return "Hello ".concat(name)+"!";
    }

    public static void main(String[] args) {
        new qurry1().helloName(" Hello");
        // qurry1 q = new qurry1();
        // String result = q.helloName("Karan");
        // System.out.println(result);

    }
}
