package behavioral.interpreter.expression;

import behavioral.interpreter.abstractexpression.AbstractExpression;

public class TerminalExpression implements AbstractExpression {
    @Override
    public int interpret() {
        return 0;
    }
}
