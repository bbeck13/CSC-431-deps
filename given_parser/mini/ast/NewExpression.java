package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class NewExpression extends AbstractExpression {
   private final String id;

   @Builder
   public NewExpression(int lineNum, String id) {
      super(lineNum);
      this.id = id;
   }
}
