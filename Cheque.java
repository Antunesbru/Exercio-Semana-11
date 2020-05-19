import javax.swing.*;

public class Cheque extends Pagamento{
   private String numeroDoCheque;
   
   public Cheque(){
      super();
      numeroDoCheque = "1234568522500";
   }
   public Cheque(String nC, String n, String c, double v){
      super(n, c, v);
      setNumeroDoCheque (nC);
   }
   
   //metodo de Acesso
   public String getNumerodoCheque(){
      return numeroDoCheque;
   }
   
   //metodo modificadores
   public void setNumeroDoCheque(String nC){
      numeroDoCheque = nC;
   }
   
}