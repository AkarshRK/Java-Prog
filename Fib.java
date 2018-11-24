//Fibonacci Series using Recursion 
class Fib 
{ 
    static int fib(int n, int a) 
    { 
        System.out.println("Parameter added: " + a);
    if (n <= 1) 
       return n; 
    return fib(n-1, a) + fib(n-2, a); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n, 10)); 
    } 
} 