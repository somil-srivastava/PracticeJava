import java.util.*;
class NextGreaterElementRight {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int flag = 0;
        int c = 0;
        for(int k:arr){
            for(int i=c;i<n;i++){
                if(k < arr[i]){
                    System.out.println(arr[c] + "  -> " + arr[i]);
                    flag = 0;
                    break;
                } else if(k >= arr[i]){
                    flag++;
                } else {
                    continue;
                }
            }
            if(flag > 0){
                System.out.println(arr[c] + "  -> " + -1);
                flag = 0;
            }
            c++;
        }
    }
}
