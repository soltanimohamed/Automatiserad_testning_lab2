package se.iths;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MeasureConverterTest{
 static MeasureConverter converter;

 @BeforeClass
 public static void init(){
   converter = new MeasureConverter();
 }

 @Test
 public void convertWeightTestTrue(){
   int result = converter.convertWeight(80, true);
   assertEquals(29, result);
 }

 @Test
 public void convertWeightTestFalse(){
   int result = converter.convertWeight(80, false);
   assertEquals(216, result);
 }

 @Test
 public void convertToFeetTest(){
   int result = converter.convertToFeet(180);
   assertEquals(6, result);
 }

}
