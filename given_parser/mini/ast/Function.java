package mini.ast;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
public class Function {
   private final int lineNum;
   private final String name;
   private final Type retType;
   private final List<Declaration> params;
   private final List<Declaration> locals;
   private final Statement body;

   @Builder
   public Function(int lineNum, String name, List<Declaration> params, Type retType,
         List<Declaration> locals, Statement body) {
      this.lineNum = lineNum;
      this.name = name;
      this.params = params;
      this.retType = retType;
      this.locals = locals;
      this.body = body;
   }
}
