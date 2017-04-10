package mini.ast;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TypeDeclaration {
   private final int lineNum;
   private final String name;
   private final List<Declaration> fields;

   public TypeDeclaration(int lineNum, String name, List<Declaration> fields) {
      this.lineNum = lineNum;
      this.name = name;
      this.fields = fields;
   }
}
