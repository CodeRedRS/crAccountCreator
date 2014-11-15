package crAccountCreator.task;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

/**
 * Created by Dakota on 11/13/2014.
 */
public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {
    public Task(C ctx) {
        super(ctx);
    }

    public abstract boolean activate();

    public abstract void execute();
}
