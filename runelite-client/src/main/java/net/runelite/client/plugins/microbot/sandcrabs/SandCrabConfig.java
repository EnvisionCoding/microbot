package net.runelite.client.plugins.microbot.sandcrabs;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.plugins.microbot.staticwalker.WorldDestinations;
import net.runelite.client.plugins.microbot.util.misc.Food;

@ConfigGroup("SandCrabPlugin")
public interface SandCrabConfig extends Config {

    @ConfigItem(
            keyName = "Use Food",
            name = "Use Food",
            description = "Use Food?",
            position = 0
    )
    default boolean useFood()
    {
        return false;
    }
    @ConfigItem(
            keyName = "Food",
            name = "Food",
            description = "type of food",
            position = 1
    )
    default Food food()
    {
        return Food.MONKFISH;
    }

}