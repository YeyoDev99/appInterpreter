package ExpresiónConcreta;
import ExpresiónAbstracta.Expression;

//Clase que representa los números en la expresión
public class Number extends Expression {
 private int number;

 public Number(int number) {
     this.number = number;
 }

 @Override
 public int interpret() {
     return number;
 }
}
