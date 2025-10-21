package survivalistessentials.platform;

import survivalistessentials.SurvivalistEssentials;
import survivalistessentials.platform.services.IPlatformHelper;

public class Services extends technology.roughness.whitenoise.platform.Services {

    public static final IPlatformHelper PLATFORM_HELPER = load(SurvivalistEssentials.LOGGER, IPlatformHelper.class);

}
