public class understandingforloop {
    void meth1() {
        System.out.println("---------mathod1 callled");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i value: " + i);

        }
        System.out.println("method1() exeuted");

    }

    void meth2() {
        System.out.println("---------mathod2 callled");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i value :" + i);

        }
        System.out.println("method2() exeuted");
    }

    void meth3() {
        System.out.println("---------mathod1 callled");
        int i = 1;
        for (; i <= 10;)
            System.out.println("i value :" + (++i));
        i++;
        System.out.println("method3() exeuted");
    }

    void meth4() {

        understandingforloop uf = new understandingforloop();
        int i = 1;
        for (System.out.println("---------method4()---------"), System.out.println(uf.meth5()); i <= 5; uf.meth6()) {
            System.out.println("i value:" + i);
            i++;

        }
    }

    String meth5() {
        System.out.println("---------mathod5 callled----------");
        return "java is awosome ";

    }

    void meth6() {
        System.out.println("------------------");

    }

    void meth7() {
        System.out.println("---------------method 7 called------");
        int i = 1;
        for (;;) {
            System.out.println("i value :" + i);
            i++;

        }
        // System.out.println("------------method7 exeuton--------");
    }

    int meth8() {
        System.out.println("----------method8() exedution");
        return 1;

    }

    void meth9() {
        System.out.println("-----------method9 () called");
        for (int i = new understandingforloop().meth8(); i <= 100; i++) {
            System.out.println("i value :" + i);

        }
        System.out.println("method 9 exeution");
    }

    public static void main(String[] args) {
        understandingforloop uf = new understandingforloop();
        // uf.meth1();
        // uf.meth2();
        // uf.meth3();
        // uf.meth7();
        uf.meth9();
    }
}
