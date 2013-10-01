package com.github.sevntu.checkstyle.checks.coding;

import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class AvoidFinalConditionInversion extends Check {

	@Override
	public int[] getDefaultTokens() {
		return new int[] { TokenTypes.LITERAL_RETURN }; //so on ...
	}

	@Override
	public void visitToken(DetailAST token)
	{
		if (token.getType() == TokenTypes.LITERAL_RETURN) {
			DetailAST expr = token.getFirstChild();
			DetailAST logicalStmt = expr.getFirstChild();

			if ("!".equals(logicalStmt.getText())) {
				log(token.getLineNo(), "You should avoid final condition inversion.");
			}
		}
	}
}
