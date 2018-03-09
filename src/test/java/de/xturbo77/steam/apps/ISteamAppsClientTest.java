package de.xturbo77.steam.apps;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author schmidt
 */
@Test
public class ISteamAppsClientTest {

    public void testSteamApps() {
        ISteamAppsClient c = new ISteamAppsClient();
        SteamApp myapp = c.getSteamApp(410320);
        Assert.assertNotNull(myapp);
        Assert.assertEquals(myapp.getAppid(), 410320);
        Assert.assertTrue(myapp.getName().contains("Shadow"));
    }

    public static void main(String[] args) {
        ISteamAppsClientTest test = new ISteamAppsClientTest();
        test.testSteamApps();
    }
}
