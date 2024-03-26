public class classD {
    public static void main(String[] args) {
        final String A = "java";
        final String B = "python";
        Thread t1 = new Thread(){
            public void run(){
                synchronized(A){
                    System.out.println("thread l locked");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}