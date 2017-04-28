package se.iths;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AmericanizerTest{
  Americanizer americanize;
 TimeConverter timer;
 MeasureConverter converter;

 @Before
 public void init(){
   americanize = new Americanizer();
   timer = new TimeConverter();
   converter = new MeasureConverter();
 americanize.setWeightConverter(converter);
 americanize.setTimeConverter(timer);
}
 @Test
 public void convertTimeTestAM(){
   String result = americanize.convertTime(11);
   assertEquals("11 AM", result);
 }

 @Test
 public void convertTimeTestPM(){
   String result = americanize.convertTime(13);
   assertEquals("1 PM", result);
 }

 @Test
 public void convertTimeTestException(){
   String result = americanize.convertTime(-1);
   assertEquals("", result);
 }

 @Test
 public void convertTimeTestException1(){
   String result = americanize.convertTime(25);
   assertEquals("", result);
 }

 @Test
 public void convertToPoundTest(){
   int result = converter.convertWeight(100, true);
   assertEquals(37, result);
 }

 @Test
 public void convertToFeetTest(){
   int result = converter.convertToFeet(90);
   assertEquals(3, result);
 }

 @Test
 public void convertSpeachTest(){
   String result = americanize.convertSpeach("struggling with junit");
   assertEquals("yo dude!struggling with junit, you know?", result);
 }

}
