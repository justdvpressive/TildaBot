package tilda.bot.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import tilda.bot.commands.Command;

public class InfoCommand extends Command {

    @Override
    public String getName() {
        //The Actual Name of the command
        //Example: "Help"
        return "Bot Information";
    }

    @Override
    public List<String> getAlias() {
        //The different names the command can be called by
        //Example: "~help" || "~?" || "~h"
        //Note: Place the command alias you want to show in the help list first
        return Arrays.asList("~information", "~info", "~dev", "~developer", "~github", "~version");
    }

    @Override
    public String getDescription() {
        //Short description of the overall command
        //Example: "List of commands and how to use them"
        return "Returns information about the bot";
    }

    @Override
    public List<String> getUsage() {
        //Detailed description of how to use the command and differnt versions of it
        //Include examples and such
        /* Example:
         * ~help OR ~help <command>
         * ~help - List the name and description of all the commands
         * ~help <command> - List the name, aliases and usage information of a specific command
         * Example: ~help help
        */
        return null;
    }

    @Override
    public void onCommand(MessageReceivedEvent e, List<String> args) {
        //The actions of the command
        String m = "**Tilda Version:** ";

        Object vers = getClass().getPackage().getImplementationVersion();
        if(vers == null){
            m += "DEVELOPMENT";
        }
        else{
            m += vers;
        }
            m += "\n**Tilda Bot Creator**: Aimi#0625";
        sendMessage(e,m);
    }

}
