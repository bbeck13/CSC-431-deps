package mini.ast;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class BlockStatement extends AbstractStatement {
   private final List<Statement> statements;

   @Builder
   public BlockStatement(int lineNum, List<Statement> statements) {
      super(lineNum);
      this.statements = statements;
   }

   public static BlockStatement emptyBlock() {
      return new BlockStatement(-1, new ArrayList<>());
   }
}
