package mini.ast;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class FalseExpression extends AbstractExpression {
   public FalseExpression(int lineNum) {
      super(lineNum);
   }
}
