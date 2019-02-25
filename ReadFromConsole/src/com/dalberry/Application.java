
package com.dalberry;

import com.dalberry.service.MyBankService;
import com.dalberry.utils.ReadFromPropertyFile;

/**
 * Entry point to the system
 * 
 * @author harshita
 *
 */
public class Application {

	public static void main(String[] args) throws Exception {
		/**
		 * Loosely coupled example We should keep entry point isolated with the
		 * type request we are dealing
		 */
		ReadFromPropertyFile.populateMasterData();
	    MyBankService myBankService=MyBankService.getInstance();
	    myBankService.applicationMenu();
	}

}