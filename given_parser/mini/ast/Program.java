package mini.ast;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Program {
   private final List<TypeDeclaration> types;
   private final List<Declaration> decls;
   private final List<Function> funcs;

   public Program(List<TypeDeclaration> types, List<Declaration> decls,
         List<Function> funcs) {
      this.types = types;
      this.decls = decls;
      this.funcs = funcs;
   }
}
