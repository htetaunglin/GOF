package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {

	private static Map<String, Platform> map = new HashMap<>();

	private PlatformFactory() {

	}

	public static Platform getInstance(String platformType) {
		Platform platform = map.get(platformType);

		if (platform == null) {
			switch (platformType) {
			case ".NET":
				platform = new DotNetPlatfrom();
				break;
			case "JAVA":
				platform = new JavaPlatform();
				break;

			}

			map.put(platformType, platform);
		}
		return platform;
	}

}
