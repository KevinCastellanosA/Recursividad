
public class Recursividad extends Interface {
    public String cad="";
    public int cont=1;
 public int Multiplicacion(int numTabla , int num){
        if(numTabla > num*10){
            return numTabla;
        }else{
            cad = num+ " x "+cont+" = "+numTabla+"\n";
            numTabla = numTabla+num;
            cont++;
            System.out.println(cad);
            return Multiplicacion(numTabla,num);
        }
    }   
}
