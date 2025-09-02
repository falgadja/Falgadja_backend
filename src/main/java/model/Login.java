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
        // Regex simples para formato de e-mail
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; // ^: Início da string, $: Fim da string//

        return email != null && email.matches(regex); // matches: Serve para verificar a senha corresponde ao formato//
    }
    //Método verificar senha
    public static boolean validarSenha(String password) {
        // Verifica se a senha tem pelo menos 8 caracteres
        return password != null && password.length() >= 8; //Verifica se esta null e se tem mais de 8 caracteres//
    }

}

