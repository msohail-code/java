public class generate_array_output{
    public static void main(String args[]){
        	int array[][]  = {{0, 1, 2, 3, 4},{5, 6, 7, 8, 9},{10, 11, 12, 13, 14},{15, 16, 17, 18, 19}};
        
        for(int x = 0;x<array.length;x++){
          for(int y=0;y<array[0].length;y++){
            System.out.print(" "+array[x][y]+" ");
          }
           System.out.print("\n");
        }
    }
}