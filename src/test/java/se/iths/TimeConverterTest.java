package se.iths;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeConverterTest{
  static TimeConverter time;
  @BeforeClass
   public static void init(){
     time = new TimeConverter();
   }

   @Test
   public void getMeridiemTestPM(){
     String result = time.getMeridiem(23);
     assertEquals("PM", result);
   }

   @Test
   public void getMeridiemTestAM(){
     String result = time.getMeridiem(0);
     assertEquals("AM", result);
   }

   @Test(expected=IllegalArgumentException.class)
   public void getMeridiemTestLower(){
     String result = time.getMeridiem(-1);
     assertEquals(null, result);
   }

   @Test(expected=IllegalArgumentException.class)
   public void getMeridiemTestHigher(){
     String result = time.getMeridiem(24);
     assertEquals(null, result);
   }

   @Test
   public void getMeridiemTestAM1(){
     String result = time.getMeridiem(1);
     assertEquals("AM", result);
   }

   @Test
   public void getMeridiemTestPM1(){
     String result = time.getMeridiem(22);
     assertEquals("PM", result);
   }

}
