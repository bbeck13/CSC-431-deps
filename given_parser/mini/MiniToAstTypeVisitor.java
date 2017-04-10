package mini;

import mini.ast.BoolType;
import mini.ast.IntType;
import mini.ast.StructType;
import mini.ast.Type;
import mini.ast.VoidType;

public class MiniToAstTypeVisitor extends MiniBaseVisitor<Type> {
   @Override
   public Type visitIntType(MiniParser.IntTypeContext ctx) {
      return IntType.builder().build();
   }

   @Override
   public Type visitBoolType(MiniParser.BoolTypeContext ctx) {
      return BoolType.builder().build();
   }

   @Override
   public Type visitStructType(MiniParser.StructTypeContext ctx) {
      return new StructType(ctx.getStart().getLine(), ctx.ID().getText());
   }

   @Override
   public Type visitReturnTypeReal(MiniParser.ReturnTypeRealContext ctx) {
      return visit(ctx.type());
   }

   @Override
   public Type visitReturnTypeVoid(MiniParser.ReturnTypeVoidContext ctx) {
      return new VoidType();
   }

   @Override
   protected Type defaultResult() {
      return new VoidType();
   }
}
