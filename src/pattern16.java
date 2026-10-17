// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sp=2*n -3;//5
//       int st=1;

//       for(int i=0;i<n;i++){
//         int val = 1;
//         for(int j=0;j<st;j++){
//           System.out.print(val+"\t");
//           val++;
//         }
//         if(sp<0){
//           sp=0;
//         }
//         for(int k=0;k<sp;k++){
//           System.out.print(" \t");
//         }
//         if(st==n){
//           st--;
//         }
//         for(int l=0;l<st;l++){
//           val--;
//           System.out.print(val+"\t");
//         }
//         sp= sp - 2;
//         st++;
        
//         System.out.println();
//       }
//     }
// }