public class binomialfactorial {

     public static int fact(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }

        return f;
    }
    
    int fact(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_n_r = fact(n-r);
        return fact_n/(fact_r*fact_n_r);

    }

    public static void main(String[] args){
        binomialfactorial b = new binomialfactorial();
        System.out.println(b.fact(5, 2));

        
    }
}
