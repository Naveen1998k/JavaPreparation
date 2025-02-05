package Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test
{
    public static void main(String[] args) {
        int num[]={1,1,2,3,1,3,6,7,1,5};


        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(num[i]);
                break;
            }

        }

        //Using Stream we find unique element from array of num

         int unique= Arrays.stream(num).filter(i-> Collections.frequency(Arrays.stream(num).boxed().collect(Collectors.toList()),i)==1).findFirst().orElseThrow();
         System.out.println(unique);


        int c=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==1){
                c++;
            }
        }System.out.println(c);
    }
}
