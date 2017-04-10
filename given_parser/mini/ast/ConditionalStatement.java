package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class ConditionalStatement extends AbstractStatement {
   private final Expression guard;
   private final Statement thenBlock;
   private final Statement elseBlock;

   @Builder
   public ConditionalStatement(int lineNum, Expression guard, Statement thenBlock,
         Statement elseBlock) {
      super(lineNum);
      this.guard = guard;
      this.thenBlock = thenBlock;
      this.elseBlock = elseBlock;
   }
}
