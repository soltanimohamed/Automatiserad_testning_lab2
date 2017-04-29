package se.iths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.experimental.categories.Category;

@Category(ConvertTime.class)
public class AmericanizerTestMockito {
	Americanizer americanize;
	@Before
	public void init(){
		americanize = new Americanizer();
	}

	@Test
	public void convertTimeTestMockAM() {
	TimeConverter timer = Mockito.mock(TimeConverter.class);
	americanize.setTimeConverter(timer);
	Mockito.when(timer.getMeridiem(11)).thenReturn("AM");
	String result = americanize.convertTime(11);
	   assertEquals("11 AM", result);

	}

	@Test
	public void convertTimeTestMockPM(){
		TimeConverter timer = Mockito.mock(TimeConverter.class);
		americanize.setTimeConverter(timer);
		Mockito.when(timer.getMeridiem(13)).thenReturn("PM");
		String result = americanize.convertTime(13);
		   assertEquals("1 PM", result);
	}

	@Test
	public void convertTimeMockException(){
		TimeConverter timer = Mockito.mock(TimeConverter.class);
		americanize.setTimeConverter(timer);
		Mockito.when(timer.getMeridiem(-1)).thenThrow(new IllegalArgumentException());
		String result = americanize.convertTime(-1);
		   assertEquals("", result);
	}

}
