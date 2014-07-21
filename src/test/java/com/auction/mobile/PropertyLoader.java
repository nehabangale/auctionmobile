package com.auction.mobile;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

	 public static Properties loadTestProperties() {

         Properties testProps = new Properties();
         try {
			testProps.load(PropertyLoader.class.getResourceAsStream("/data.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
         return testProps;
	 }

}