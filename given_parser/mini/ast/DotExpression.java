package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class DotExpression extends AbstractExpression {
   private final Expression left;
   private final String id;

   @Builder
   public DotExpression(int lineNum, Expression left, String id) {
      super(lineNum);
      this.left = left;
      this.id = id;
   }
}
