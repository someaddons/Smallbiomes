package com.smallbiomes;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

import static com.smallbiomes.SmallbiomesMod.MODID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class SmallbiomesMod {
    public static final String MODID = "smallbiomes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static Random rand = new Random();

    public SmallbiomesMod() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "", (c, b) -> true));
    }
}
