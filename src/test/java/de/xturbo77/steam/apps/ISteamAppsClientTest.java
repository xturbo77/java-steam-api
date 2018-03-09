package de.xturbo77.steam.apps;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author schmidt
 */
public class ISteamAppsClientTest {

    @DisplayName("Test access to a specified steam app")
    @Test
    public void testSteamApps() {
        ISteamAppsClient c = new ISteamAppsClient();
        SteamApp myapp = c.getSteamApp(410320);
        Assert.assertNotNull(myapp);
        Assert.assertEquals(410320, myapp.getAppid());
        Assert.assertTrue(myapp.getName().contains("Shadow"));
    }

    public static void main(String[] args) {
        ISteamAppsClientTest test = new ISteamAppsClientTest();
        test.testSteamApps();
    }
}
