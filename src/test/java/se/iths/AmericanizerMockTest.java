/*package se.iths;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AmericanizerMockTest{
  Americanizer americanize;

  @Before
  public void setup(){
    TimeConverter timer = mock(TimeConverter.class);
    //MeasureConverter converter = mock(MeasureConverter.class);
    when(timer.getMeridiem(11)).ThenReturn("AM");
  }

  @Test
  public void convertTimeTestAM(){
    String result = americanize.convertTime(11);
    assertEquals("11 AM", result);
  }
} */
