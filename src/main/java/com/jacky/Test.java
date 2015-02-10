package com.jacky;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
/**
 * Created by jacky on 2015/2/10.
 * 中文测试一下
 */
public class Test {

    private static Logger log = LogManager.getLogger(Test.class);

    public static void main(String[] args){
        System.out.println("This is c测试");
        log.debug("This Debug");

        System.out.println("This is c测试2");
    }


}
