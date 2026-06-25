public class numtriangle {
    public static void main(String [] args){
        // ---- Number Triangle ----
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        // ---- Upside Down Number Triangle ----
        // for (int i = n; i>= 1; i--){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // ---- Alt way to print Upside Down Number Triangle ----
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n-i+1; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();

        // }
        // ---- Floyd's Triangle ----
        // int num = 1;
        // for (int i = 1; i<=n; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(num + " ");    // ekhane num er value loop er body er vitore increment holeo loop body er baire gele tar value stored thakche karon define loop er baire korano hyeche
        //         num++;
        //     }
        //     System.out.println();
        // }
        // ---- 0-1 Triangle ----
        for (int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}