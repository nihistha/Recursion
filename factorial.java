public class factorial{
    public int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num -1);
        

    }
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println(f.fact(5)); 
    }
}