package com.redactor;

import org.junit.Test;
import static org.junit.Assert.*;

import com.redactor.fragments.*;

import static java.util.Objects.deepEquals;

public class TextParserTest {
  @Test
  public void testParse() {
    Text actual = TextParser.parse("asdasd\r\nasdasdas\r\n");

    assertEquals(3, actual.size());
  }
}
