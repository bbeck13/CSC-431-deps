package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class ReadExpression extends AbstractExpression {

   @Builder
   public ReadExpression(int lineNum) {
      super(lineNum);
   }
}
