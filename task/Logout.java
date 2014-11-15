package crAccountCreator.task;

import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/13/2014.
 */
public class Logout extends crChopChopper.task.Task<ClientContext> {
    public Logout(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.game.loggedIn();
    }

    @Override
    public void execute() {
        ctx.game.logout(false);
    }
}
