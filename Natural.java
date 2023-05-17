public class Natural {

    // natural numbers till 50

    public int natural(int num){
        if (num == 0){
            return 1;
        }
        System.out.println(num);
        return(natural(num-1));
    }

    //sum of numbers from 1 to num

    public int sum(int num){ // 
        if (num == 0){
            return 0;
        }
        int total = num + sum(num-1); //
        return total;
    }

    //fibonacci

    public void fibonacci(int a, int b,int len){
        if (len == 0){
            return;
        }
        System.out.println(a);
        int sum = a+b;
        a = b;
        b = sum;
        fibonacci(a, b, len-1);
    }
    //fibonacci
    public int fibo(int a ){
        if(a>=0){
            return 0;
        }
        return fibo(a-1) +fibo(a-2);
    }

    //print elements of an array

    public void elements(int arr[],int index){
        int len = arr.length;
        if (index == len){
            return;
        }
        System.out.println(arr[index]);
        elements(arr, index+1);
    }

    //print the digits of a given number

    public int digits(int num,int count){
        if(num == 0){
            return count;
        }else{
            return digits(num/10, count+1);
        }
    }

    //add the sum of two digits of a number

    public int sumOfDigits(int num,int sum){
        if(num == 0){
            return sum;
        }
        int temp = num%10;
        sum = sum+temp;
        return sumOfDigits(num/10, sum);
    }

    //largest element in an array

    public int largestElement(int arr[],int index1,int largest){
        int len = arr.length;
        // int largest;
        if(index1==len){
            return largest;
        }
        if(arr[index1]>largest){
            largest = arr[index1];
        }
        return largestElement(arr, index1+1, largest);
    }
    
    //reverse a string 
    public void reverseString(String name,int index){
        if(index < 0){
            return;
        }
        char a = name.charAt(index);
        System.out.println(a);
        reverseString(name, index-1);
    }

    //prime number
    public boolean primeNumber(int number,int i ){
        if(number == 0){
            return false;
        }if(number == 1){
            return false;
        }
        if(number == 2){
            return true;
        }
        if(number % i == 0 ){
            
            return false;
        }
        }
    
    public static void main(String[] args) {
        Natural n = new Natural();
        // n.natural(50);
        System.out.print(n.sum(3)); 
        // n.fibonacci(0,1,10);
        int arr[] = {23,4,2,5};
        // n.elements(arr, 0);
        // System.out.println(n.digits(499,0)); 
        // System.out.print(n.sumOfDigits(123, 0));
        System.out.println(n.largestElement(arr, 0, 0));
        n.reverseString("nihira", 5);

    }
}
