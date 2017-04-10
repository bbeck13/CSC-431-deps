package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class NullExpression extends AbstractExpression {

   @Builder
   public NullExpression(int lineNum) {
      super(lineNum);
   }
}
