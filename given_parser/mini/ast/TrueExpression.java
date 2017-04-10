package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class TrueExpression extends AbstractExpression {
   @Builder
   public TrueExpression(int lineNum) {
      super(lineNum);
   }
}
