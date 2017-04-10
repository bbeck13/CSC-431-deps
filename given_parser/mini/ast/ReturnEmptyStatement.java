package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class ReturnEmptyStatement extends AbstractStatement {
   @Builder
   public ReturnEmptyStatement(int lineNum) {
      super(lineNum);
   }
}
