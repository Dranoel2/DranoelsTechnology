package net.dranoel.technology.entrypoints;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DranoelsTechnology implements ModInitializer {
	public static final String MODID = "dranoels_technology";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
