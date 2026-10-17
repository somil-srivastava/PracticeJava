// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sp1 = n/2;
//       int st = 1;
//       int tempst=0;

//       for(int i=0;i<n;i++){
//           if(i==n/2){
//             st=n;
//             sp1=0;
//           }
//         for(int j=0;j<sp1;j++){
//           System.out.print(" \t");
//         }
//         for(int k=0;k<st;k++){
//           System.out.print("*\t");
//         }
//         System.out.println();
//         if(i<n/2){//012
//           st++;
//           tempst = st;
//         } else {
//           sp1=n/2;
//           tempst--;
//           st = tempst;
//         }
//       }
//     }
// }