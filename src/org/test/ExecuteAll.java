package org.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.test.tc.Sample2;




@RunWith(Suite.class)

@Suite.SuiteClasses({JUnit.class,Sample.class,Sample2.class})
public class ExecuteAll {

	}
	


