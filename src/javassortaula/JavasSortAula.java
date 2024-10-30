
package javassortaula;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JavasSortAula {
    
     public static Pessoa[] geraArrayPessoas() {
        return new Pessoa[]{
            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
            new Pessoa("Ana", LocalDate.of(1983, 3, 15)),
            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))
        };
    }
     
      public static Integer[] geraArrayAleatorio(int size, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Gera um número aleatório entre min e max
        }
        return array;
    }

    public static void main(String[] args) {
    Integer[] vetor1 = geraArrayAleatorio(100, 1, 20);
    Integer[] vetor2 = vetor1.clone();
    Integer[] vetor3 = vetor1.clone();
    
    BubbleSort<Integer> bsort = new BubbleSort<>();
    SelectionSort<Integer> ssort = new SelectionSort<>();
    InsertionSort<Integer> isort = new InsertionSort<>();
    
    Comparator<Integer> comparatorInteiro = Integer::compareTo;

    long inicio = System.currentTimeMillis();
    bsort.sort(vetor1);
    long tfinal = System.currentTimeMillis();
    long tempo = tfinal - inicio;
    System.out.println("Tempo do Bubble Sort: " + tempo + " ms, Comparações: " + bsort.getContaComparacoes());
    
    inicio = System.currentTimeMillis();
    ssort.sort(vetor2);
    tfinal = System.currentTimeMillis();
    tempo = tfinal - inicio;
    System.out.println("Tempo do Selection Sort: " + tempo + " ms, Comparações: " + ssort.getContaComparacoes());
    
    inicio = System.currentTimeMillis();
    isort.sort(vetor3);
    tfinal = System.currentTimeMillis();
    tempo = tfinal - inicio;
    System.out.println("Tempo do Insertion Sort: " + tempo + " ms, Comparações: " + isort.getContaCompacaoes());




        
     // crie um objeto pessoa
     // chame a busca binária
     
     
     /*  int tamanho = 100, min = 1, max =20;
       Integer[] vetor1 = geraArrayAleatorio(tamanho,min,max);
       Integer[] vetor2 = new Integer[tamanho];
       Integer[] vetor3 = new Integer[tamanho];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor para busca:");
        Integer x = scanner.nextInt();
        Search busca = new Search();
        System.out.println("Busca Linear");
        System.out.println("Posicao:"+busca.linearSearch(vetor1, x));
        System.out.println("Comparacoes:"+busca.getContaComparacoes());
        

       for(int i=0;i<tamanho;i++){
           vetor2[i]=vetor1[i];
           vetor3[i] = vetor1[i];
           System.out.print("|"+vetor1[i]);
       }// copia do vetor 1 para os outros 2
        System.out.println("");
       Comparator<Integer> comparatorInteiro = (a,b)-> a.compareTo(b);
       
       BubbleSort<Integer> bsort = new BubbleSort<>();
       SelectionSort<Integer> ssort = new SelectionSort<>();
       InsertionSort<Integer> isort = new InsertionSort<>();
       
       long inicio = System.currentTimeMillis();
       bsort.sort(vetor1, comparatorInteiro);
       long tfinal = System.currentTimeMillis();
       long tempo = tfinal - inicio;
        System.out.println("Tempo do Bubble Sort:"+tempo + " Comparacoes:"+ bsort.getContaComparacoes());
       
        // Selection Sort
       inicio = System.currentTimeMillis();
       ssort.sort(vetor2, comparatorInteiro);
       tfinal = System.currentTimeMillis();
       tempo = tfinal - inicio;
       System.out.println("Tempo do Selection Sort:"+tempo + " Comparacoes:"+ssort.getContaComparacoes());
       
       // Insertion Sort
       inicio = System.currentTimeMillis();
       isort.sort(vetor3);
       tfinal = System.currentTimeMillis();
       tempo = tfinal - inicio;
       System.out.println("Tempo do Insertion Sort:"+tempo+ " Comparacoes:"+ isort.getContaCompacaoes());
       //System.out.println("Vetor ordenado:");

        System.out.println("Busca Binaria");
        System.out.println("Posicao:"+busca.binarySearch(vetor1, x));
        System.out.println("Comparacoes:"+busca.getContaComparacoes());
       
*/
    }
    
}
