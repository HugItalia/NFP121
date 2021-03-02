package question2;

public class RealVaultAccess extends AbstractVaultAccess {
    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        return "access_granted";
    }
}
