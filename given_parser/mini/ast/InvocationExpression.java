package mini.ast;

import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper=false)
@Value
public class InvocationExpression extends AbstractExpression {
   private final String name;
   private final List<Expression> arguments;

   @Builder
   public InvocationExpression(int lineNum, String name, List<Expression> arguments) {
      super(lineNum);
      this.name = name;
      this.arguments = arguments;
   }
}
