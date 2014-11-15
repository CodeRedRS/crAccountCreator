package crAccountCreator.task.create.info;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class Name extends Task<ClientContext> {
    public Name(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return acWIDGET.RANDOM_WIDGET.visible()
                && acWIDGET.NAME_WIDGET.text().equals("");
    }

    @Override
    public void execute() {
        acWIDGET.RANDOM_WIDGET.click();
        Condition.sleep(Random.nextInt(250, 500));
    }
}
