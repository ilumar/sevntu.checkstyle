package com.github.sevntu.checkstyle.checks.coding;

import org.junit.Test;

import com.github.sevntu.checkstyle.BaseCheckTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;

public class AvoidFinalConditionInversionTest extends BaseCheckTestSupport {

	@Test
	public void testDefault() throws Exception {

		final DefaultConfiguration checkConfig = createCheckConfig(AvoidFinalConditionInversion.class);

		final String[] expected = {
				"7: You should avoid final condition inversion.",
		};

		verify(checkConfig, getPath("AvoidFinalConditionInversion.java"), expected);
	}
}
