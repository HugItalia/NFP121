package question2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VaultAccessTest {
    @Test
    public void checkRightAccess() {
        AbstractVaultAccess vaultAccess = new ProxyVaultAccess();
        assertEquals("access_granted", vaultAccess.accessVault("vault_key", true, "vault_password", true));
        assertEquals("access_denied", vaultAccess.accessVault("", true, "", true));
    }
}
