package crAccountCreator;

import crAccountCreator.task.CutScene;
import crAccountCreator.task.Logout;
import crAccountCreator.task.create.CreateCharacter;
import crAccountCreator.task.create.Login;
import crAccountCreator.task.create.info.*;
import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by CodeRed on 11/13/2014.
 */
@Script.Manifest(name = "AccountCreator", description = "Creates accounts", properties = "client=6")
public class AccountCreator extends PollingScript<ClientContext> {
    public static final java.util.List<Task> taskList = new ArrayList<Task>();

    @Override
    public void start() {
        acWIDGET.initWidgets(ctx);
        //ctx.properties.put("login.disable", "true");
        taskList.addAll(Arrays.asList(new Login(ctx), new Logout(ctx), new CreateCharacter(ctx), new Name(ctx),
                new Age(ctx), new Email(ctx), new Password(ctx), new PlayNow(ctx), new CutScene(ctx)));
    }

    @Override
    public void stop() {
    }

    @Override
    public void poll() {
        for (Task task : taskList) {
            if (task.activate()) {
                task.execute();
            }
        }
    }
}
