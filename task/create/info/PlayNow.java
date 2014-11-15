package crAccountCreator.task.create.info;

import crAccountCreator.var.acWIDGET;
import crChopChopper.task.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.rt6.ClientContext;

import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by CodeRed on 11/14/2014.
 */
public class PlayNow extends Task<ClientContext> {
    ArrayList<String> accounts = new ArrayList<String>();
    Date curDate = new Date();
    SimpleDateFormat formatDate = new SimpleDateFormat("dd-M-yyyy (hh-mm)");

    public PlayNow(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return acWIDGET.DONE_WIDGET.visible()
                && !acWIDGET.NAME_WIDGET.text().equals("")
                && !acWIDGET.AGE_WIDGET.text().equals("")
                && !acWIDGET.EMAIL_ADDRESS_WIDGET.text().equals("")
                && !acWIDGET.PASSWORD_WIDGET.text().equals("");
    }

    @Override
    public void execute() {
        acWIDGET.DONE_WIDGET.click();
        Condition.sleep(50);
        accounts.add(Email.email + ":" + Password.password);
        System.out.println(Email.email + ":" + Password.password);
        try {
            PrintStream out = new PrintStream(new File(ctx.controller.script().getStorageDirectory().getPath(), "accounts" + formatDate.format(curDate) + ".txt"));
            out.println(accounts);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (!ctx.players.local().inViewport()) {
            Condition.sleep(50);
        }
    }
}
