package com.demo1.suites;

import com.demo1.testcases.ByNameDemo;
import com.demo1.testcases.WebviewDemo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Aaron on 2016/3/5.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({WebviewDemo.class, ByNameDemo.class})
public class Part1 {
}
