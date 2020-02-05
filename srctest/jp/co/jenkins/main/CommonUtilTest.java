package jp.co.jenkins.main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CommonUtilTest {

	@Test
	public void Format_Test() {
		assertThat(CommonUtil.Format("Cat"), is("You said Cat."));
	}

	@Test
	public void CalcAdd_Test() {
		assertThat(CommonUtil.CalcAdd(1, 2), is(3));
	}

}
