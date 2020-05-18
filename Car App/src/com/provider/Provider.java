package com.provider;

import com.services.AccountServices;
import com.summarycar.Services;

public class Provider {

	
		public static Services getObject() 
		{
			return new AccountServices();
		}
	}

