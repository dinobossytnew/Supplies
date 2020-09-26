package ml.karmaconfigs.Supplies;

import ml.karmaconfigs.Supplies.Utils.SuministryUtils;
import org.bukkit.plugin.java.JavaPlugin;

/*
GNU LESSER GENERAL PUBLIC LICENSE
                       Version 2.1, February 1999
 Copyright (C) 1991, 1999 Free Software Foundation, Inc.
 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
[This is the first released version of the Lesser GPL.  It also counts
 as the successor of the GNU Library Public License, version 2, hence
 the version number 2.1.]
 */

/**
 * @SuministryPlugin
 *
 * <code>A suministry plugin for your
 * server, custom suministries and a
 * pretty falling animation</code>
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new SuministryUtils().start();
    }

    @Override
    public void onDisable() {
        new SuministryUtils().stop();
    }
}
