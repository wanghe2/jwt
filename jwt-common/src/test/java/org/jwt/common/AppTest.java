package org.jwt.common;

import com.wang.domain.CheckResult;
import com.wang.util.TockenUtil;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    public void testApp() throws InterruptedException
    {
    	/**
    	 * 利用jwt生成 token
    	 */
    	String tocken=  TockenUtil.createJWT("wanghe", "123456", 10000);
//    	Thread.sleep(1000);
    	System.err.println("*******token is "+tocken);
    	
    	/**
    	 * 验证token是否有效
    	 */
    	CheckResult checkResult=TockenUtil.validateJWT(tocken);
    	System.err.println("*******是否是有效token "+checkResult.getSuccess());
    	if(checkResult.getSuccess()==false) {
    		System.err.println("******* 验证不通过的原因  : "+checkResult.getErrCode());
    	}
    	
    	/**
    	 * 解析token
    	 */
    	String username= checkResult.getClaims().get("jti", String.class);
    	String password= checkResult.getClaims().get("sub", String.class);
    	System.err.println("用户名 ："+username+" ，密码 ："+password);
    }
}
