package crAccountCreator.task.create.info;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class Age extends Task<ClientContext> {
    public Age(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return acWIDGET.AGE_WIDGET.visible()
                && acWIDGET.AGE_WIDGET.text().equals("");
    }

    @Override
    public void execute() {
        acWIDGET.AGE_WIDGET.click();
        Condition.sleep(50);
        ctx.input.send(String.valueOf(Random.nextInt(13, 99)));
        Condition.sleep(Random.nextInt(250, 500));
    }
}
