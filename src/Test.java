import java.util.*;


public class Test {

        static int[] bubbleSort(int[] list) {
                int n = list.length;
                int min;
                int [] slist = list;

                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                                if(slist[j-1] > slist[j]){
                                        min = slist[j-1];
                                        slist[j-1] = slist[j];
                                        slist[j] = min;
                                }

                        }

                }
                return slist;
        }



        public static void main(String[] args) {

                int[] l ={3,60,35,2,45,320,5};
                int n=l.length;
                System.out.println(Arrays.toString(l));
                System.out.println(Arrays.toString(bubbleSort(l)));

        }
        }