package org.sample.mavensample7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("hello");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("hello1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("hello2");
  }

}
