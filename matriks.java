
//program transpos matriks
public class matriks {
    
    public static void main(String[] args) {
        int[][] arr= { 
        {4,3,6} , 
        {5,2,1}, 
        {9,0,8} };

        for (int i = 0; i < (int)arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");
        
       //arr[0] length = 2
       //arr length = 3
       //arrT[2][3]
        int[][] arrT = new int[(int)arr[0].length][(int)arr.length];
    
        for (int b = 0; b < arr[0].length; b++) {
            for (int x =0; x< arr.length; x++) {
           
                arrT[b][x] = arr[x][b];
            }
        }
        
            
        
            
    
            for (int t = 0; t < (int)arrT.length; t++) {
                for (int g = 0; g < arrT[0].length; g++) {
                    System.out.print(arrT[t][g]);
                }
                System.out.println("");
            }
            
    }

}
