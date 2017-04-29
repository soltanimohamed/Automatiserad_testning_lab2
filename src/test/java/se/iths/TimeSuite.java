package se.iths;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@IncludeCategory(ConvertTime.class)
@SuiteClasses({TimeConverterTest.class, AmericanizerTest.class})
public class TimeSuite {

}
