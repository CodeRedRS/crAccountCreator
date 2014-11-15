package crAccountCreator.task.create.info;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class Email extends Task<ClientContext> {
    public static String email;

    public Email(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return acWIDGET.EMAIL_ADDRESS_WIDGET.visible()
                && acWIDGET.EMAIL_ADDRESS_WIDGET.text().equals("");
    }

    @Override
    public void execute() {
        email = String.valueOf(System.currentTimeMillis() / 10000);
        acWIDGET.EMAIL_ADDRESS_WIDGET.click();
        Condition.sleep(50);
        ctx.input.send(email + "@gmail.com");
        email = acWIDGET.EMAIL_ADDRESS_WIDGET.text();
        Condition.sleep(Random.nextInt(250, 500));
    }
}
