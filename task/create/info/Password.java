package crAccountCreator.task.create.info;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class Password extends Task<ClientContext> {
    public static String password;

    public Password(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return acWIDGET.PASSWORD_WIDGET.visible()
                && acWIDGET.PASSWORD_WIDGET.text().equals("");
    }

    @Override
    public void execute() {
        password = "whatdoesthefoxsay";
        ctx.input.move(acWIDGET.PASSWORD_WIDGET.centerPoint());
        ctx.input.click(true);
        Condition.sleep(500);
        acWIDGET.PASSWORD_WIDGET.click();
        ctx.input.send(password);
        Condition.sleep(Random.nextInt(1000, 1100));
    }
}