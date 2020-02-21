import java.util.*;

public class MergeSort {

    int[] merge(int list[], int first, int middle, int last)
    {

        int[] slist = list;

        int n1 = middle - first + 1;
        int n2 = last - middle;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = slist
                    [first + i];
        for (int j=0; j<n2; ++j)
            R[j] = slist
                    [middle + 1+ j];

        int i = 0,j = 0;
        int k = first;
        
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                slist
                        [k] = L[i];
                i++;
            }
            else
            {
                slist
                        [k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            slist
                    [k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            slist
                    [k] = R[j];
            j++;
            k++;
        }

        return slist;
    }

    void sort(int slist[], int first, int last)
    {
        if (first < last)
        {
            int middle = (first+last)/2;

            sort(slist, first, middle);
            sort(slist, middle+1, last);

            merge(slist, first, middle, last);
        }
    }



    public static void main(String args[]) {
        int list[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        System.out.println(Arrays.toString(list));

        MergeSort ob = new MergeSort();
        ob.sort(list, 0, list.length - 1);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(list));
    }
    }
