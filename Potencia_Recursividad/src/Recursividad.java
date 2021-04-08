
/**
 *
 * @author princ
 */
public class Recursividad {
   public double Potencia(double x, double y){
      if(y==0){
           return 1;
      }else{
           return x*Potencia(x,y-1);
      }
   } 
}
