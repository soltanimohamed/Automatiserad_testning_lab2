package se.iths;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(ConvertTime.class)
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
   public void getMeridiemTestException(){
     String result = time.getMeridiem(-1);
     assertEquals(null, result);
   }
}
