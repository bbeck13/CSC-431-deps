package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class PrintLnStatement extends AbstractStatement {
   private final Expression expression;

   @Builder
   public PrintLnStatement(int lineNum, Expression expression) {
      super(lineNum);
      this.expression = expression;
   }
}
