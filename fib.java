class fib{
    public static void main(String[] args) {
        int f=10,fib;

        for(int x=0; x<=f;x++){
            if(x<=1){
                fib = x;
            }
            else{
                fib = (x-1) + (x-2);
            }

            System.out.print(fib+" ");
        }

       
    }
}      