package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = false)
@Value
public class WhileStatement extends AbstractStatement {
   private final Expression guard;
   private final Statement body;

   @Builder
   public WhileStatement(int lineNum, Expression guard, Statement body) {
      super(lineNum);
      this.guard = guard;
      this.body = body;
   }
}
