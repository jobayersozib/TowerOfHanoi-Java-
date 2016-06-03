public static int factorial(int fact,int n){
                if(n==0){
                fact=1;
                return fact;
                }
                
                fact=n*factorial(fact,n-1);;
                return fact;
        } 