package mini.ast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class LvalueId implements Lvalue {
   private final int lineNum;
   private final String id;

   public LvalueId(int lineNum, String id) {
      this.lineNum = lineNum;
      this.id = id;
   }
}
