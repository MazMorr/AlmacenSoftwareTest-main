
package modelo;

public class LoginContext{
   private  Strategy strategy;
   
   
   public LoginContext(){};
           
   public void setVerifyUser(Strategy strategy){
       this.strategy=strategy;
   }
   public boolean executeLogin(String username,String password){
      return strategy.verifyUser(username, password);
   }
}
