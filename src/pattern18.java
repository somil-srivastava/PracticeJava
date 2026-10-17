// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sp= (n/2 -1);
//       int st=3;

//       for(int i=0;i<n;i++){
//         if(i<=n/2){
//           for(int j=0;j<n;j++){
//           if(i==j || i==0 || i==(n-1) || i+j==(n-1)){
//             System.out.print("*\t");
//           } else {
//             System.out.print(" \t");
//           }
//         }
//         } else {
//           for(int k=0;k<sp;k++){
//             System.out.print(" \t");
//           }
//           for(int l=0;l<st;l++){
//             System.out.print("*\t");
//           }
//         }
//        if(i>n/2){
//          st += 2;
//          sp--;
//        }
//         System.out.println();
//       }
//     }
// }
