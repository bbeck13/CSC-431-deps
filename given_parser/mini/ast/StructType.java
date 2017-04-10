package mini.ast;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class StructType implements Type {
   private final int lineNum;
   private final String name;

   @Builder
   public StructType(int lineNum, String name) {
      this.lineNum = lineNum;
      this.name = name;
   }
}
