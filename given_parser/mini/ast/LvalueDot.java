package mini.ast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class LvalueDot implements Lvalue {
   private final int lineNum;
   private final Expression left;
   private final String id;

   public LvalueDot(int lineNum, Expression left, String id) {
      this.lineNum = lineNum;
      this.left = left;
      this.id = id;
   }
}
