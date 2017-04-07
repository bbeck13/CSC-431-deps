# Should really move to something else to manage the build.

# Provided code assumes Java 8
JAVAC=javac
JAVA=java
ANTLRJAR=../antlr-4.6-complete.jar
JSONJAR=../javax.json-1.0.4.jar

CLASSPATH_MOD=$(ANTLRJAR):$(JSONJAR)

FILES=mini/MiniCompiler.java mini/MiniToJsonVisitor.java mini/MiniToAstDeclarationsVisitor.java mini/MiniToAstExpressionVisitor.java mini/MiniToAstFunctionVisitor.java mini/MiniToAstProgramVisitor.java mini/MiniToAstStatementVisitor.java mini/MiniToAstTypeDeclarationVisitor.java mini/MiniToAstTypeVisitor.java

GENERATED=mini/MiniBaseVisitor.java mini/MiniLexer.java MiniLexer.tokens Mini.tokens mini/MiniVisitor.java mini/MiniParser.java mini/MiniBaseListener.java mini/MiniListener.java

all : MiniCompiler.class

MiniCompiler.class : antlr.generated ${FILES}
	$(JAVAC) -cp ${CLASSPATH}:$(CLASSPATH_MOD) mini/*.java mini/ast/*.java

antlr.generated : Mini.g4
	$(JAVA) -cp ${CLASSPATH}:$(CLASSPATH_MOD) org.antlr.v4.Tool -visitor Mini.g4
	touch antlr.generated
	mv *.java mini

clean:
	\rm -rf *generated* ${GENERATED} mini/*.class mini/ast/*.class
