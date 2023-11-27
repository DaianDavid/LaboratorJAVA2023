package lab08;

 import java.util.*;
 import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        problema_nr1();
        problema_nr2();
        problema_nr3();
    }
    // Java program to remove duplicates from a list using streams.
    public static void problema_nr1(){
        List<Integer> nr = Arrays.asList(1,2,2,3,4,6,6,7,8,8,8);
    //vom folosi stream pentru a parcurge lista si pentru a verifica fiecare element din list daca e sau nu duplicat.
        List<Integer> duplicatul =nr.stream().distinct().collect(Collectors.toList());

        System.out.println("Aici va fi lista fara numerele care sunt dublicate: " + duplicatul);
    }

    //Java program to cout the number of string in a list that start with a specific leter using stream.
    public static void problema_nr2(){
       List<String> lista = Arrays.asList("cajon","congas","bongos","djebme","cascas");
       char litera_aleasa = 'c';
       int counter =(int) lista.stream().filter(s->s.startsWith(String.valueOf(litera_aleasa))).count();
        System.out.println("Cu litera c incep : " + counter);
    }
    //Java program to sort a list ASC/DESC using streams.
    public static void problema_nr3(){
        List<Integer> numarul = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Acum introduceti dimensiunea dorita apoi in functie de dimensiunea dorita intruduceti elemntele");
        int dimensiune = scanner.nextInt();
        for(int i=0; i<dimensiune ; i++){
            numarul.add(scanner.nextInt());
        }
        Collections.sort(numarul);
        System.out.println("Lista ASC : " + numarul);
        Collections.sort(numarul,Collections.reverseOrder());
        System.out.println("Lista DESC : " + numarul);


    }


}
