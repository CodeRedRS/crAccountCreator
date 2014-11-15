package crAccountCreator.task;

import crAccountCreator.var.acWIDGET;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class CutScene extends crChopChopper.task.Task<ClientContext> {
    public CutScene(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.game.loggedIn() && acWIDGET.ESC_CUTSCENE_WIDGET.visible();
    }

    @Override
    public void execute() {
        acWIDGET.ESC_CUTSCENE_WIDGET.click();
    }
}
