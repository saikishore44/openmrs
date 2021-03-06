/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This Annotation class is used to mark test cases generated by the eclipse "behaviortestgenerator"
 * plugin. See http://openmrs.org/wiki/Unit_Testing_with_%40should <br/>
 * <br/>
 * This allows a unit test to be linked back to a specific behavior being tested on a specific
 * method. The class being tested is implied from the name of the parent test class.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Verifies {
	
	/**
	 * The text description of what this test will be doing. This is how unit tests are linked back
	 * to a specific "@should" on the (hopefully) many "@shoulds" on a method.
	 * 
	 * @return the text after the "@should" on the method this unit test is testing
	 */
	public String value();
	
	/**
	 * The method name within the class that this unit test is testing.
	 * 
	 * @return the name of the method being tested
	 */
	public String method();
}
