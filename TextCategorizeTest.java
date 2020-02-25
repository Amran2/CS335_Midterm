import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TextCategorizeTest {

  // Input string for TextCategorize. Do not change!
  private String text = "The frisky rabbit ran rapidly away and avoided the hungry fox.";
  private TextCategorize tct;

  @BeforeEach
  /** Must instantiate the string of text every time */
  void setUp() {
      tct = new TextCategorize(text); // instantiates object
  }


  @Test
  /**
   * Checks that categories are added after it has been instantiated
   */
  void categorizeTest() {
    //first assertFalse
    assertFalse(tct.hasCategories());
    //add variable
    tct.categorize();
    //asset that it's true
    assertTrue(tct.hasCategories());
  }

  @Test
  /**
   *Tests that categories are stored in an Arraylist
   */
  void getCategoriesTest() {
      ArrayList<String> exp = new ArrayList<String>(Arrays.asList("t", "f", "r", "a","h"));
      tct.categorize();
      assertEquals(exp.size(), tct.getCategories().size());
  }

  @Test
  /**
   * Checks the the total number of words across all categories.
   */
  void getWordCountTest() {
      assertFalse(tct.hasCategories());
      tct.categorize();
      assertEquals(11, tct.getWordCount()); //11 words in the test string
       }

  @Test
  /**
   *Checks if the list of words are correctly indexed
   */
  void getWordsForTest() {
      //list the string in order
      ArrayList<String> expected = new ArrayList<String>(Arrays.asList("and", "avoided", "away","fox", "frisky","hungry", "rabbit","ran", "rapidly", "the", "the"));
      tct.categorize();
      //compare the two lists order... but having trouble figure out how to make it all into to array without using just one specific letter
      //assertEquals(expected, tct.getWordsFor().toArray());
  }
}