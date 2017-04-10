package mini.ast;

import lombok.Getter;

@Getter
public abstract class AbstractExpression implements Expression {
   private final int lineNum;

   public AbstractExpression(int lineNum) {
      this.lineNum = lineNum;
   }
}