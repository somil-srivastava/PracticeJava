// import java.util.*;

// public class diffarray {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int nn1 = 0;
//       int nn2 = 0;
//       //input of first array...
//       int n1 = scn.nextInt();
//       int p1 = (int)Math.pow(10,(n1-1));
//       int[] a = new int[n1];
//       for(int i=0;i<n1;i++){
//         a[i] = scn.nextInt();
//         //converting to number...
//         nn1 = nn1 + a[i]*p1;
//         p1/=10;
//       }

//       //input of second array...
//       int n2 = scn.nextInt();
//       int p2 = (int)Math.pow(10,(n2-1));
//       int[] b = new int[n2];
//       for(int i=0;i<n2;i++){
//         b[i] = scn.nextInt();
//         //converting to number...
//         nn2 = nn2 + b[i]*p2;
//         p2/=10;
//       }

//       int diff = nn1 - nn2;
//       if(diff<0){
//         diff*= -1;
//       }
//       int temp = diff;
//       int n = 0;
//       while(temp!=0){
//         temp/=10;
//         n++;
//       }
//       int[] result = new int[n];
//       for(int i=1;i<=n;i++){
//         result[n-i] = diff%10;
//         diff/=10;
//       }
//       for(int i=0;i<n;i++){
//         System.out.print(result[i]+" ");
//       }
      
//     }

// }
