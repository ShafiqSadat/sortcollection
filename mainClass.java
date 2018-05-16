//main class

package myTests;

import java.util.Random;
import java.util.Scanner;

public class mainClass {
    public static void main(String args[]) throws Exception{
        try{
        QuickSort qs = new QuickSort();
        mergeSort mg = new mergeSort();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many arrays do you want? enter in decimal");
        int count = input.nextInt();
        int myArray[] = new int[count];
        for (int i=0;i<myArray.length;i++) {
            myArray[i]= random.nextInt(999+i);
        }
        System.out.println("OK now select sort mode which sort mode do you wont to use ?");
        System.out.println("1 > Bubble Sort\n2 > inserTion Sort\n3 > selecTion Sort\n4 > Quick Sort\n5 > Merge Sort");
        int sortMode = input.nextInt();
        System.out.println("Array Before Sort :");
        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        switch(sortMode){
            case 1:
                fun();
                bubbleSort(myArray);
                System.out.println("\nArray After Sort :");
                for (int i = 0; i <myArray.length; i++) {
                System.out.print(myArray[i]+" ");
                }
                break;
            case 2:
                fun();
                insertionSort(myArray);
                System.out.println("\nArray After Sort :");
                for (int i = 0; i <myArray.length; i++) {
                System.out.print(myArray[i]+" ");
                }
                break;
            case 3:
                fun();
                selectionSort(myArray);
                System.out.println("\nArray After Sort :");
                for (int i = 0; i <myArray.length; i++) {
                System.out.print(myArray[i]+" ");
                }
                break;
            case 4:
                fun();
                qs.sort(myArray);
                System.out.println("Time to sort "+qs.end+" Milli Seconds!");
                for (int i = 0; i <myArray.length; i++) {
                System.out.print(myArray[i]+" ");
                }
                break;
            case 5:
                fun();
                mg.sort(myArray);
                System.out.println("Time to sort "+qs.end+" Milli Seconds!");
                for (int i = 0; i <myArray.length; i++) {
                System.out.print(myArray[i]+" ");
                }
                break;
        }
    }catch(InterruptedException e){
       System.out.println();
    }
}
        public static void bubbleSort(int [] array){
        long start = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        long end = System.currentTimeMillis()-start;
        System.out.println("time to sort : "+end+" Milli Seconds!");
    }
       public static void insertionSort(int array[]){
           long start = System.currentTimeMillis();
           int counter = array.length;
           int outer = 1;
          while(outer<counter){
            int key = array[outer];
            int inner = outer-1;
            while(inner>=0 && array[inner]>key){
                array[inner+1] = array[inner];
                inner-=1;
            }
            array[inner+1]=key;
            outer+=1;
        }
        long end = System.currentTimeMillis()-start;
        System.out.println("time to sort : "+end+" Milli Seconds!");
    }
        public static void selectionSort(int array[]){
        long start = System.currentTimeMillis();
        int outer = 0;
        while(outer<array.length-1){
            int index=outer;
            int inner = outer+1;
            while(inner<array.length){
                if(array[inner]<array[index]){
                    index=inner;
                }
                inner+=1;
            }
            int temp = array[index];
            array[index] = array[outer];
            array[outer] = temp;
            outer+=1;
        }
        long end = System.currentTimeMillis()-start;
        System.out.println("time to sort : "+end+" Milli Seconds!");
        
    }
        public static void fun() throws InterruptedException{
            String a = "";
            int b = 0;
            for (int i = 0; i < 10; i++) {
                a+="➖";
                b++;
                System.out.println(b+"0%"+a);
                Thread.sleep(100);
            }
            System.out.println("Done Your Array Sorted !");
        }
}
