package crAccountCreator.task.create;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class CreateCharacter extends Task<ClientContext> {
    public CreateCharacter(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return acWIDGET.DONE_WIDGET.visible()
                && acWIDGET.RANDOMISE_BUTTON_WIDGET.visible()
                && !acWIDGET.RANDOM_WIDGET.visible();
    }

    @Override
    public void execute() {
        acWIDGET.DONE_WIDGET.click();
    }
}
