package mini.ast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Declaration {
   private final int lineNum;
   private final Type type;
   private final String name;

   public Declaration(int lineNum, Type type, String name) {
      this.lineNum = lineNum;
      this.type = type;
      this.name = name;
   }
}
