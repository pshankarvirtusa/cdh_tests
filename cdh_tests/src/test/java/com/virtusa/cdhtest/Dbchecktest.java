package com.virtusa.cdhtest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import com.virtusa.cdhtest.*;

public class Dbchecktest {
	 public ClouderaHiveJdbcTest cdhtest;
	 
	@BeforeTest
	  public void beforeTest() {
		  
		  cdhtest =  new ClouderaHiveJdbcTest();
		  //cdhtest.runQuery();
		 
	  }
	
  @Test
  public void dbcheck() throws Exception {
	
	  cdhtest.runQuery();
	  	
  }
 

  @AfterTest
  public void afterTest() {
  }

}
