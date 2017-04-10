package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class IntegerExpression extends AbstractExpression {
   private final String value;

   @Builder
   public IntegerExpression(int lineNum, String value) {
      super(lineNum);
      this.value = value;
   }
}
