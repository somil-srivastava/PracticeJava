// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//       Scanner scn = new Scanner(System.in);
//       //input of first array...
//       int n1 = scn.nextInt();
//       int[] a = new int[n1];
//       for(int i=0;i<n1;i++){
//         a[i] = scn.nextInt();
//       }

//       //input of second array...
//       int n2 = scn.nextInt();
//       int[] b = new int[n2];
//       for(int i=0;i<n2;i++){
//         b[i] = scn.nextInt();
//       }
//       int max = n1;
//       int min = n2;
//       if(n2>n1){
//         max = n2;
//         min = n1;
//       }
//       int[] diff = new int[max];
//       int i = n1-1;
//       int j = n2-1;
//       int k = max-1;
//       int c = 0;
//       while(k>=0){
//         int d = 0;
//         if(n2>n1){
//           if(j>=0){
//             d = b[j];//1
//           if(c==1){
//             d-=1;
//           }
//           }
//           if(i>=0){
//           if(d<a[i]){//
//             d+=10;
//             c = 1;
//           }
//             d-=a[i];
//           }
//         } else if(n1>n2){
//           if(i>=0){
//             d = a[i];
//           if(c==1){
//             d-=1;
//           }
//           }
//           if(j>=0){
//           if(d<b[j]){
//             d+=10;
//             c = 1;
//           }
//             d-=b[j];
//           }
//         }
//         diff[k] = d;
//       i--;
//       j--;
//       k--;
//       }
//       for(i=0;i<max;i++){
//         System.out.println(diff[i]);
//       }
//     }
    
// }