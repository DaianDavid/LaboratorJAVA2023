package lab7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
       // problema1_var1();
        // problema1_var2();
         //problema2_var1();
          problema2_var2();
    }
    public static void problema1_var1() {
        List<Integer> numereInteregi = Arrays.asList(2,3,12,15,16,17,26,46,68,79);
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereInteregi.forEach(n ->{
            sum.set(sum.get() + n);
        });

        System.out.println(sum.get()/numereInteregi.size());
    }


    public static void problema1_var2() {
        List<Integer> numereInteregi = Arrays.asList(2,3,12,15,16,17,26,46,68,79);

        double v = numereInteregi.stream()
                .mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);

        System.out.println(v);
    }
    public static void problema2_var1() {
        List<String> Lista = Arrays.asList("ana","are","mere","dana","are","pere");
        Lista.forEach(s ->{
            Lista.set(Lista.indexOf(s), s.toUpperCase());
        });
        System.out.println(Lista);
    }

    public static void problema2_var2() {
        List<String> Lista = Arrays.asList("ana","are","mere","dana","are","pere");

        List<String> lista2 = Lista.stream()
                   .map(s -> s.toUpperCase())
                   .collect(Collectors.toList());
        System.out.println(lista2);
    }
}
