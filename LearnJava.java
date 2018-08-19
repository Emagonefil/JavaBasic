//


/*
 * 
 * 
 * */
public class LearnJava{
  
  public static void main(String[] args){
    
    System.out.println("Hello, world!");
    
    System.out.print("no line");
    
    System.out.println(" new line \\n");
    
    System.out.println("abc" +'e');
    
    
    int myInt;
    myInt = 1;
    System.out.println(myInt);
    
    int a1, a2, a3;
    a1 = a2 = a3 = 3;
    System.out.println(a1 + ',' + a2 + ',' + a3);
    
    int a4 = 4;
    System.out.println(a4);
    
    
    float myFloat = 0.33f;
    
    double myDouble = 0.0003;
    
    System.out.println(myFloat);
    
    final int myFinalInt = 123;

    
    int[] myArray = new int[10];
    for(int i = 0; i < 10;i++){
    
        myArray[i] = i;   
        System.out.println(myArray[i]);
      
    }
    System.out.println(myArray);
    
    
  }
}