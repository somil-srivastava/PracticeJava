// import  java.util.*;

// public class inverseofnum {
//     public static void main(){
//         Scanner num = new Scanner(System.in);
//         int n = num.nextInt();

//         int temp;
//         int digit;
//         int loc = 1;
//         int loc_copy = 1;
//         int sum = 0;
//         while(n!=0){
//             digit = n%10;
//             n = n/10;
//             temp = loc;
//             loc = digit;
//             digit = temp;
//             int zeros = (int)Math.pow( 10, loc-1);
//             sum = digit*zeros + sum;
//             loc = loc_copy;
//             loc++;
//             loc_copy++;
//         }
//         System.out.println(sum);
//     }
// }
