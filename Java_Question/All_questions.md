<h1 style="text-align: center;">All Questions and Answers :)</h1>

<h3>This is login java code?
</h3>

```java
import java.util.Scanner;
public class login {
	public static void main(String[] args) {
		String x = "Sunil"; 
       	String y = "password"
;       	Scanner s = new Scanner (System.in); 
        System.out.print("Enter username:"); 
        String input_x = s.nextLine(); 
        System.out.print("Enter password:"); 
        String input_y = s.nextLine();

        if ((input_x.equals(x) && input_y.equals(y))) { 
            System.out.println("Welcome user."); 
        } else { 
            System.out.println("Wrong password"); 
        } 
        
	}
}
```
        