//Fibonacci Series using Recursion 
class Fib 
{ 
    static int fib(int n, int a, int b) 
    { 
        System.out.println("Parameter added: " + a + b);
    if (n <= 1) 
       return n; 
    return fib(n-1, a, b) + fib(n-2, a, b); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n, 10, 20)); 
    } 
} 