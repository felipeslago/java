package jse25.plataformEnvironment;

public class SecurityManagerPolicies {

    /**
     * O Security Manager eh um objeto que define as politicas de seguranca de uma aplicacao
     *
     * Essas politicas de seguranca definem quais acoes nao sao seguras ou sensiveis para qualquer classe acessar
     *
     * Acoes nao permitidas pelo Security Manager lancam uma SecurityException
     *
     * Normalmente essas permissoes sao checadas automaticamente, porem eh possivel checa-las manualmente atraves do
     * metodo System.getSecurityManager
     */

    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPropertiesAccess();
        }
    }

}
