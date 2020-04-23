import java.util.function.Function;

public class Lambada {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(11);
            }
        }).start();

        new Thread(() -> System.out.println(11)).start();

        Integer integer = paseValues(a -> Integer.valueOf(a), "1441");
        System.out.println(integer);
    }
    public static Integer paseValues(Function<String,Integer> function,String value){
        return function.apply(value);
    };

}
