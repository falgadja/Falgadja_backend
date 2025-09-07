package model;

public class Login {
    private String email;
    private String password;

    //Construtor
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    //Método get e set
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //Método verificar email
    public static boolean validarEmail(String email) {
       if(email == null) { //Verifica se o email esta null//          
           return false;
       }
       //Posição do @
       int posicao = email.indexOf('@');
       if(posicao<=0 || posicao==email.length()-1) { //Verifica se o @ esta na primeira ou ultima posição//
           return false;
       } else {
           return true;
          
       }  
    }    
    //Método verificar senha
    public static boolean validarSenha(String password) {
        return password != null && password.length() >= 8; //Verifica se esta null e se tem mais de 8 caracteres//
    }

}

