package jp.co.jenkins.main;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

class CommonUtilTest {

	@Test
	void Format_Test() {
		assertThat(CommonUtil.Format("Cat"), is("You said Cat."));
	}

	@Test
	void CalcAdd_Test() {
		assertThat(CommonUtil.CalcAdd(1, 2), is(3));
	}

}
