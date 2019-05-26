
import java.io.IOException;
import java.net.URLDecoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivam
 */
public class NewClass {
    void check() 
    {try{
    String str = "Ӈ#7ùª9¨M¤À.áÔ¥6¦¨¹.ÿÓÂ.Ö£JºÓ¹WþÊmãÖÚG¤¢dÈ9&òªћ#³­1᧨";
    String result = str.toString();
    System.out.println(result);
    }
    
    catch(Exception io)
    {} 
    }
    
   public static void main(String[] args)
   {
       NewClass ne = new NewClass();
       ne.check();
      
   }
}
