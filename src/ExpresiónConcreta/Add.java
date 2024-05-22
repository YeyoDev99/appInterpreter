package ExpresiónConcreta;
import ExpresiónAbstracta.Expression;

//Clase que representa la operación de suma
public class Add extends Expression {
 private Expression leftExpression;
 private Expression rightExpression;

 public Add(Expression left, Expression right) {
     this.leftExpression = left;
     this.rightExpression = right;
 }

 @Override
 public int interpret() {
     return leftExpression.interpret() + rightExpression.interpret();
 }
}
