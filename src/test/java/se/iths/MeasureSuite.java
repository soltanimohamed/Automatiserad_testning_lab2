package se.iths;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ConvertMeasure.class)
@SuiteClasses({MeasureConverterTest.class, AmericanizerTest.class})
public class MeasureSuite {

}
