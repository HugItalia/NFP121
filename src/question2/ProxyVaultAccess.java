package question2;

public class ProxyVaultAccess extends AbstractVaultAccess  {

    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        if (key.equals("") && password.equals("")) {
            return "access_denied";
        } else {
            return "access_granted";
        }
    }
}
