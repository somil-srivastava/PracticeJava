// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sp=n/2;
//       int st=1;
//       int a=1;
//       int b=1;
//       int add=0;
//       int rev=0;
//       int p=0;

//         for (int i = 0; i < n; i++){
//             for(int j=0;j<sp;j++){
//               System.out.print(" \t");
//             }
//             for(int k=0;k<st;k++){
//               add = a+k;
//               if(i>(n/2)){//
//                 p=n-i-1;
//               } else {
//                 p=i;
//               }
//               if(k>=(p+1)){
//                 rev--;
//                 System.out.print(rev+"\t");
//               } else {
//                 System.out.print(add+"\t");
//                 rev = add;
//               }
//             }
          
//             if(i<(n/2)){
//               b--;
//               a++;
//               sp--;
//               st = st+2;//st +=2
//             } else {
//               b++;
//               a--;
//               sp++;
//               st = st-2;//st -= 2
//             }
//           System.out.println();
//         }
//     }
// }

// ------------------------------------------[OR]-------------------------------------------

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sp=n/2;
//       int st=1;
//       int val=1;
//         for (int i = 0; i < n; i++){
//             for(int j=0;j<sp;j++){
//               System.out.print(" \t");
//             }
//             int cval = val;
//             for(int k=0;k<st;k++){
//               System.out.print(cval+"\t");
//               if(k<st/2){
//                 cval++;
//               } else {
//                 cval--;
//               }
//             }
          
//             if(i<(n/2)){
//               val++;
//               sp--;
//               st += 2;
//             } else {
//               val--;
//               sp++;
//               st -= 2;
//             }
//           System.out.println();
//         }
//     }
// }