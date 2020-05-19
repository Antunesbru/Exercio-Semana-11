import javax.swing.*;

public class Pagamento{
   private String nomeDoPagador;
   private String cpf;
   private double valorASerPago;
   
   public Pagamento(){
      nomeDoPagador = "Bruno Antunes";
      cpf = "123.456.789-55";
      valorASerPago = 30.000;
   }
   
   public Pagamento(String n, String c, double v){
      nomeDoPagador = n;
      cpf = c;
      valorASerPago = v;  
   }
   
   //metodo de acesso
   public String getNomeDoPagador(){
      return nomeDoPagador;
   }
   public String getCpf(){
      return cpf;
   }
   public double getValorASerPago(){
      return valorASerPago;
   }
   
   //metodo modificadores
   public void setNomeDoPagador(String n){
      nomeDoPagador = n;
   }
   public void setCpf(String c){
      cpf = c;
   }
   public void setValorASerPago(double v){
      valorASerPago = v;
   }
   

}