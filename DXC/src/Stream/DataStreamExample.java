package Stream;
import java.io.FileInputStream; 
public class DataStreamExample {
	 public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("C:\\Users\\skurli\\OneDrive - DXC Production\\Desktop\\testout.txt");    
           int i=fin.read();  
           System.out.print((char)i);    
 
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }    
       }  


