package net.cacpixel.betterRTM;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = BetterRTM.MODID, name = BetterRTM.NAME, version = BetterRTM.VERSION, dependencies = BetterRTM.DEPENDENCIES)
public class BetterRTM
{
    public static final String MODID = "better-rtm";
    public static final String NAME = "BetterRTM";
    public static final String VERSION = "1.0";
    public static final String DEPENDENCIES = "required-after:rtm;required:ngtlib";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("#############################");
        logger.info(BetterRTM.NAME + " is Starting!");
        logger.info("#############################");
    }
}
