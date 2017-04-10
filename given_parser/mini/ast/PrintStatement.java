package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class PrintStatement extends AbstractStatement {
   private final Expression expression;

   @Builder
   public PrintStatement(int lineNum, Expression expression) {
      super(lineNum);
      this.expression = expression;
   }
}
