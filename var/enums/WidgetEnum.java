package crAccountCreator.var.enums;

import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Component;

/**
 * Created by CodeRed on 11/13/2014.
 */
public enum WidgetEnum {
    LOGOUT_BUTTON_WIDGET(1465, 9),
    LOGOUT_LOGOUT_WIDGET(26, 7),
    CREATE_FREE_ACCOUNT_WIDGET(596, 86),
    DONE_WIDGET(1420, 158),
    RANDOM_WIDGET(1420, 207),
    AGE_WIDGET(1420, 264),
    EMAIL_ADDRESS_WIDGET(1420, 5),
    PASSWORD_WIDGET(1420, 257),
    RANDOMISE_BUTTON_WIDGET(1420, 102),
    PLAY_NOW_WIDGET(1420, 469),
    ESC_CUTSCENE_WIDGET(548, 7),
    SKIP_TUTORIAL_WIDGET(1433, 132),
    CHAT_WIDGET(1186,3),
    YES_WIDGET(1188, 12),
    NAME_WIDGET(1420, 271);


    private final int widget;
    private final int componenet;

    private WidgetEnum(final int widget, final int component) {
        this.widget = widget;
        this.componenet = component;
    }

    public int getWidget() {
        return this.widget;
    }

    public int getComponenet() {
        return this.componenet;
    }

    public Component setWidget(ClientContext ctx) {
        return ctx.widgets.widget(this.widget).component(this.componenet);
    }
}
