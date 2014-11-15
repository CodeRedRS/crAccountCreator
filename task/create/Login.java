package crAccountCreator.task.create;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/13/2014.
 */
public class Login extends Task<ClientContext> {
    public Login(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return !ctx.game.loggedIn()
                && acWIDGET.CREATE_FREE_ACCOUNT_WIDGET.visible();
    }

    @Override
    public void execute() {
        acWIDGET.CREATE_FREE_ACCOUNT_WIDGET.click();
    }
}
