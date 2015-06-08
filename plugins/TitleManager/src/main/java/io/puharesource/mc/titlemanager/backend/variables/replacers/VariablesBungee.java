package io.puharesource.mc.titlemanager.backend.variables.replacers;

import io.puharesource.mc.titlemanager.TitleManager;
import io.puharesource.mc.titlemanager.api.variables.Variable;
import io.puharesource.mc.titlemanager.api.variables.VariableReplacer;
import org.bukkit.entity.Player;

public final class VariablesBungee implements VariableReplacer {
    @Variable(rule = "BUNGEECORD", vars = {"BUNGEECORD-ONLINE", "BUNGEECORD-ONLINE-PLAYERS"})
    public String onlinePlayers(Player player) { return String.valueOf(TitleManager.getInstance().getBungeeManager().getOnlinePlayers()); }

    @Variable(rule = "BUNGEECORD", vars = {"SERVER", "SERVER-NAME"})
    public String serverName(Player player) { return TitleManager.getInstance().getBungeeManager().getCurrentServer().getName(); }
}
