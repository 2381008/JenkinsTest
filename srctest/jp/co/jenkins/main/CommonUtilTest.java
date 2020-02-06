package jp.co.jenkins.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommonUtilTest {

	@Test
	public void Format_Test() {
		Assertions.assertEquals(CommonUtil.Format("Cat"), "You said Cat.");
	}

	@Test
	public void CalcAdd_Test() {
		Assertions.assertEquals(CommonUtil.CalcAdd(1, 2), 3);
	}

	@Test
	public void CalcSub_Test() {
		Assertions.assertEquals(CommonUtil.CalcSub(15, 2), 0);

}
