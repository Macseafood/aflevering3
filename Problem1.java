
import java.net.*;    

public class Problem1 { 

    public static void main(String[] args){ 
        try { 
            InetAddress address = InetAddress.getLocalHost(); 
            System.out.println(address); 
        } 
        catch (UnknownHostException uhEx) { 
        	System.out.println( "test2");
        }
    } 
} 