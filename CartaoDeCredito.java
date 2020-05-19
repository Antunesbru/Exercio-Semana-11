import javax.swing.*;

public class CartaoDeCredito extends Pagamento{
   private String numeroDoCartao;
   
   public CartaoDeCredito(){
      super();
      numeroDoCartao = "3129145700327542";
   }
   public CartaoDeCredito(String nU, String n, String c, double v){
      super(n, c, v);
      setNumeroDoCartao (nU);
   }
   
   //metodo de Acesso
   public String getNumerodoCartao(){
      return numeroDoCartao;
   }
   
   //metodo modificadores
   public void setNumeroDoCartao(String nU){
      numeroDoCartao = nU;
   }
   
}