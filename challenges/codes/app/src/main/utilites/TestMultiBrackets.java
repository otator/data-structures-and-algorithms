package codes.app.src.main.utilites;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestMultiBrackets {

  @Test
  public void testMultiBracketValidationEmptyCode(){
    String code = "";
    assertTrue("must return true for empty code", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationOne1(){
    String code = "(";
    assertFalse("must return false for one open bracket", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationOne2(){
    String code = "}";
    assertFalse("must return false for one close bracket", MultiBracketValidation.multiBracketValidation(code));
  }


  @Test
  public void testMultiBracketValidationCode1(){
    String code = "{}";
    assertTrue("must return true for balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode2(){
    String code = "{}(){}";
    assertTrue("must return true for balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode3(){
    String code = "()[[Extra Characters]]";
    assertTrue("must return true for balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode4(){
    String code = "(){}[[]]";
    assertTrue("must return true for balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode5(){
    String code = "{}{Code}[Fellows](())";
    assertTrue("must return true for balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode6(){
    String code = "[({}]";
    assertFalse("must return false for NOT balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode7(){
    String code = "(](";
    assertFalse("must return false for NOT  balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode8(){
    String code = "{{(})}";
    assertFalse("must return false for NOT balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }

  @Test
  public void testMultiBracketValidationCode9(){
    String code = "[]][][][][][][[[][][][][][][][]]]]";
    assertFalse("must return false for NOT balanced brackets", MultiBracketValidation.multiBracketValidation(code));
  }
}
