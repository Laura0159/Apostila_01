public class Carros{
   private String rodas;
    public void setRodas (String n){
        rodas = n;
    }
    private String retrovisor;
    public void setRetrovisor (String n){
        retrovisor = n;
    }
     public String getRodas(){
        return rodas;
     }

     public String getRetrovisor(){
        return retrovisor;
     }
     public void acelerar(){
        System.out.println("está sendo acelerado");
     }

     public void regular(){
        System.out.println("procurando o melhor ângulo");
     }
}