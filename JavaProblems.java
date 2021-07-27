package learningProblemJava;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Integer;

public class JavaProblems {
	public static void main(String[] args) {
		
		int a = 1, b = 5, c = 2;     
	 
		System.out.println("Welcome to Learning Problems Of Java\n");
		flipTheCoin();
		LeapYear();
		harmonicNumber();
		primeFactorisation();
		quotientRemainder();
		swappingOfNumber();
		checkEvenOdd();
		checkConsonantVowel();
		playingWithNumbers();
		calculateRoots(a, b, c);  
		
		
		
		//Problem 03 Power of Two
        
        
        int n = Integer.parseInt(args[0]);

        int j = 0;               
        int powerOfTwo = 1;     
        
        while (j <= n) {
        	
        	System.out.println("Power of two series");
            System.out.println(j + " " + powerOfTwo+"\n");   
            powerOfTwo = 2 * powerOfTwo;                
            j++;
        }
       
        
        
        
        //3.  Euclidian Distance
        
        
        int X = Integer.parseInt(args[0]);
	       int Y = Integer.parseInt(args[1]);

	      
	       double dist = Math.pow(X*X+ Y*Y,0.5);

	       
	       System.out.println("distance from " + X + ", " + Y + " to (0, 0)  = " + dist);
	       
	       
	       
	       
	            //5.      Wind   Chill
	       
	   
	           double t = Double.parseDouble(args[0]);
	           double v = Double.parseDouble(args[1]);
	           double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	           System.out.println("Temperature = " + t);
	           System.out.println("Wind speed  = " + v);
	           System.out.println("Wind chill  = " + w);
	       

		}
		
	
	
	
	
		public static void flipTheCoin() {
			//Problem 01 Flip The Coin
			
			int hCount = 0;
	        int tCount = 0;
	        Scanner input = new Scanner(System.in);
	        System.out.println("How many times coins should be tossed?");
	        int times= input.nextInt();
	        
	        if(times>0) {
	        
		        for(int i=0;i<times;i++) {
			        if (Math.random() < 0.5) {
			            System.out.println("Heads");
			            hCount++;
			        } 
			        else {
			            System.out.println("Tails");
			            tCount++;
			        }
		        }
	        
		        double headpercent = hCount*100 / times;
		        System.out.println(headpercent);
		        double tailpercent = tCount*100 / times;
		        System.out.println(tailpercent + "\n"); 
		        
		        }
	        else {
	        	System.out.println("Invalid Number\n");
	        	
	        }
			
		}
		public static void LeapYear() {
			//Problem 02  Leap Year
	       
	        System.out.println("Enter the year");
	        Scanner inpyear = new Scanner(System.in);
	        int year = inpyear.nextInt();
	        
	        if(year>999 && year<10000) {
	        	if(year%4 ==0 && year%100 !=0 || year%400 ==0 ) {
	        		
	        		System.out.println("Year is a leap year\n");
	        		
	        	}
	        	
	        	else {
	        		
	        		System.out.println("Year is not a leap year\n");
	        	}
	        }
			
		}
		
	
		public static void harmonicNumber() {
			
			//Problem 04 Harmonic Number
	        
	        System.out.print("Enter any number : ");
	        Scanner S = new Scanner(System.in);
	        int N= S.nextInt(); double result = 0;
	        while(N > 0){
	               result = result + (double) 1 / N;
	               N--;
	          }
	        
	        System.out.println("");
	        System.out.println("The Value Of Nth Harmonic Number  "+result);
			
		}
		
		public static void primeFactorisation() {
			//Problem 05 Prime Factorization
	        
	        
	        int number;
	        Scanner prime = new Scanner(System.in);
	        System.out.println("Enter a number ::");
	        number = prime.nextInt();
	       
	        for(int i = 2; i*i<=number; i++) {
	           while(number%i == 0) {
	              number = number/i;
	              System.out.println(i);
	           }
	        }
			
		}
		
		
		
		public static void quotientRemainder(){
			//Problem 06 Quotient and remainder
	        
	        
	        System.out.println("Enter the dividend");
	        Scanner dividend =new Scanner(System.in);
	        int divi = dividend.nextInt();
	        System.out.println("Enter the divisor");
	        Scanner divisor = new Scanner(System.in);
	        int div = divisor.nextInt();
	        
	        int Quotient = divi/div;
	        int Remainder = divi%div;
	        System.out.println("The quotient and remainder are "+ Quotient+" "+ "and"+" "+ Remainder);
		}
		
		public static void swappingOfNumber() {
			// Problem 07 Swapping of numbers
	        
	        System.out.println("Enter the two numbers");  
	        Scanner a =new Scanner(System.in);
	        int x = a.nextInt();
	        Scanner b = new Scanner(System.in);
	        int y = b.nextInt();
	        System.out.println("value of x:" + x);  
	        System.out.println("value of y:" + y);  
	        System.out.println("After swapping");  
	        x = x + y;  
	        y = x - y;  
	        x = x - y;  
	        System.out.println("value of x:" + x);  
	        System.out.println("value of y:" + y);  
		}
		
		public static void checkEvenOdd() {
			//Problem 08  EvenOdd
	        
	        
	        System.out.println("Enter the  number");  
	        Scanner inputnum =new Scanner(System.in);
	        int inp = inputnum.nextInt();
	        
	        if(inp%2==0) {
	        	
	        	System.out.println("The number is even");
	        }
	        else {
	        	
	        	System.out.println("The number is odd");
	        }
	        
		}
		
		public static void checkConsonantVowel() {
			//Problem 09 ConsonantVowel
	        
			System.out.println("Enter the alphabet ");
			Scanner character =new Scanner(System.in);
			String ch = character.next();
			        
			switch (ch) {
					case "a":
					case "e":
			        case "i":
			        case "o":
			        case "u":
			        case "A":
			        case "E":
			        case "I":
			        case "O":
			        case "U":
			        	
			            System.out.println(ch + " is vowel");
			            break;
			            
			        default:
			            System.out.println(ch + " is consonant");
			    }
			      
		}
		
		public static void playingWithNumbers() {
			
			//Problem 10  Largest among three numbers
	        
	        
	        int p,q,r;
	        Scanner t = new Scanner(System.in);
	        System.out.print("Enter the first number:");
	        p = t.nextInt();
	        Scanner u = new Scanner(System.in);
	        System.out.print("Enter the second number:");
	        q = u.nextInt();
	        Scanner v = new Scanner(System.in);
	        System.out.print("Enter the third number:");
	        r = v.nextInt();
	        if(p > q && p > r)
	        {
	            System.out.println("Largest number is:"+p);
	        }
	        else if(q > r)
	        {
	            System.out.println("Largest number is:"+q);
	        }
	        else
	        {
	            System.out.println("Largest number is:"+r);
	        }
	        
	      
	        
	        
	        
	        //Functional Programs 
		
		
		
	        //2. Sum of three Integers add to zero
	        
	        
	        int arr[] = {1, 0, 2, -4, 3};
	        int array = arr.length;
	        int count=0;
	        
	        
	        for (int d = 0; d < array -2; d++)
	        {
	        for (int e = d + 1; e < array-1; e++)
	        {
	        for (int f = e + 1; f < array; f++)
	        {
	        if (arr[d] + arr[e] + arr[f] == 0)
	        {
	        System.out.println(arr[d]+ " " + arr[e] + " " + arr[f]);
	        count++;
	        }
	        }
	        }
	        }
	       System.out.println(count);
	       
		}
	  
	       
	     
			
		       
           // 4.  Roots of a quadratic equation
           
           
           
           static void calculateRoots(int a, int b, int c)  
           {  
           
           if (a == 0)   
           {  
           System.out.println("The value of a cannot be 0.");  
           return;  
           }  
           //calculating discriminant (d)  
           int d = b * b - 4 * a * c;  
           if (d > 0)   
           {  
        	   double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
        	   double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a); 
        	   System.out.println("The roots are " + r1 + " and " + r2);  
           }
           
           else if (d == 0)   
           {  
        	   double r1 = -b / (2.0 * a);  
        	   System.out.println("The root is " + r1);  
           }  
           // executes if d < 0  
           else   
           {  
        	   System.out.println("Roots are not real.");  
           }
		
           
           
           
           
           //5.      Wind   Chill
           
               
	  
     }          
}
