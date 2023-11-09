class Prime{
    public static void main(String[] args){
        int cnt = 0;
        if(args.length >= 1){
            int num = Integer.parseInt(args[0]);

            for(int i = 2; i < num; i++){
                if((num % i) == 0){
                    cnt++;
                }
            }
            if(cnt >1){
                System.out.println("Not a prime number.");
            } else{
                System.out.println("Prime number.");
            }
        } else {
            System.out.println("Pass a number.");
        }
    }
}