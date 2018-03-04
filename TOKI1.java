import java.util.Scanner;
public class TOKI1 {

    /**
     * @param args the command line arguments
     */
    String nomor;
    int nilai1, nilai2, nilai3;
    
    static void Sorting (TOKI1 A[]){
        for (int i=0 ; i<A.length ; i++){
            int imin = i;
            for (int j=i ; j<A.length ; j++){
                if (A[j].nilai3 > A[imin].nilai3 ){
                    imin = j;
                }
            }
             TOKI1 temp = A[i];
             A[i]=A[imin];
             A[imin]=temp;
        }
    }
    
     static void NilaiSama (TOKI1 A[]){
         TOKI1 temp;
         for (int i= 0 ; i<A.length ; i++){
             for (int j=i+1 ; j<A.length ; j++){
                 if (A[i].nilai3==A[j].nilai3){
                     if (A[j].nilai2>A[i].nilai2){
                         temp = A[i];
                         A[i] = A[j];
                         A[j] = temp;
                     }
                     else if (A[j].nilai2==A[i].nilai2 && A[j].nilai1 > A[i].nilai1){
                         temp = A[i];
                         A[i] = A[j];
                         A[j] = temp;
                     }
                 }
             }
         }
     }
     
     static void Print (TOKI1 A[]){
         for (int i=0 ; i<A.length ; i++){
             System.out.print(A[i].nomor + " ; " + A[i].nilai1 + " ; " + A[i].nilai2 + " ; " + A[i].nilai3);
             System.out.println("");
         }
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt(); 

              
        String A [] = new String [x];
        
    //    int f =0 ; //pembantu
        for (int i=0 ; i<x ; i++){
        int n = sc.nextInt(); 
        int m = sc.nextInt (); 
        String cari = sc.next();
        TOKI1 data []=new TOKI1[n]; 
        for (int k=0 ; k<data.length ; k++){
            data [k]=new TOKI1 ();
        } //menyiapkan data
            for (int l=0 ; l<data.length ; l++){
            data[l].nomor=sc.next();
            data[l].nilai1=sc.nextInt();
            data[l].nilai2=sc.nextInt();
            data[l].nilai3=sc.nextInt();
        } //memasukkan data
         Sorting (data); //sorting
       NilaiSama (data); //melihat nilai yang sama
          for (int j=0 ; j<data.length ; j++){
              if (data[j].nomor.equals(cari)){
                  if (j+1<=m){
                      A[i]="YA";
                  }
                  else {
                      A[i]="TIDAK";
                  }
              }
          }
         }
        for (String J : A){
            System.out.println(J);
        }
    }   
}
