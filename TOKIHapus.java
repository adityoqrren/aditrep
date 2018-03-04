import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class TOKIHapus {

    /**
     * @param args the command line arguments
     */
    static void Cek (String a, String b){
        char A []= a.toCharArray();
        char B []= b.toCharArray();
        
        int i = 0;
        int j = 0;
        int k = 0;
       if (B.length == A.length-1){
       while (i<A.length){
           if (A[i]!=B[j] && j<A.length-1){
               k++;
               j=j-1;
           }
	   else if (j==A.length-2&&k==0){
               break;
           }
        j++;
        i++;

            if (k>1){
                System.out.println("Wah, tidak bisa :(");
                break;
            }
       }
         if (k<=1){
          System.out.println("Tentu saja bisa!");
         }
     }
      else {
          System.out.println("Wah, tidak bisa :(");
     }
        

    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String a = br.readLine();
        String b = br.readLine();
        
        Cek (a,b);

	}
}