//Hollow Rectangle pattern
// public class patterns{
//     public static void hollow_rectangle(int totRows, int totCols){
//         for(int i = 1; i<=totRows;i++){
//             for(int j = 1; j <= totCols;j++){
//                 if(i==1 || i== totRows || j== 1 || j==totCols){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollow_rectangle(4, 5);
//     }
// }

// *****
// *   *
// *   *
// *****


//Inverted and Rotated half pyramid
// public class patterns {
//     public static void invertedPyramid(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         invertedPyramid(4);
//     }
// }

//    *
//   **
//  ***
// ****



//Inverted half pyramid with numbers

// public class patterns{
//     public static void inverted_half_pyramid(int n){
//         for(int i =1; i<=n;i++){
//             for(int number =1; number<=n-i+1;number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         inverted_half_pyramid(5);
//     }
// }

// 12345
// 1234
// 123
// 12
// 1

//Floyd's triangle

// public class patterns{
//     public static void floyd_triangle(int n){
//         int ch=1;
//         for(int i = 1; i<=n;i++){
//             for(int j = 1; j<=i ;j++){
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         floyd_triangle(5);
//     }
// }
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 


//0-1 Triangle pattern

// public class patterns{
//     public static void triangle_pattern(int n){
//         for(int i = 1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         triangle_pattern(5);
//     }
// }
// 1
// 01
// 101
// 0101
// 10101


//Butterfly pattern

// public class patterns{
//     public static void butterfly_pattern(int n){
//         for(int i =1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//              for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//          for(int i =n;i>=1;i--){
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//              for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         butterfly_pattern(4);
//     }
// }

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


//Solid rhombus

// public class patterns{
//     public static void rhombus_pattern(int n){
//         for(int i = 1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<n+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         rhombus_pattern(5);
//     }
// }
//     *****
//    *****
//   *****
//  *****
// *****

//Hollow rhombus
// public class patterns{
//     public static void hollow_rhombus_pattern(int n){
//         for(int i = 1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollow_rhombus_pattern(5);
//     }
// }

//     *****
//    *   *
//   *   *
//  *   *
// *****

//Diamond pattern

public class patterns{
    public static void diamond_pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }     
             for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =n;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }     
             for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            diamond_pattern(10);
    }
}

         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *