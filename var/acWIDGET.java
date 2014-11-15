package crAccountCreator.var;

import crAccountCreator.var.enums.WidgetEnum;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Component;

/**
 * Created by CodeRed on 11/13/2014.
 */
public class acWIDGET {
    public static Component LOGOUT_BUTTON_WIDGET, LOGOUT_LOGOUT_WIDGET, CREATE_FREE_ACCOUNT_WIDGET, DONE_WIDGET,
            RANDOM_WIDGET, AGE_WIDGET, EMAIL_ADDRESS_WIDGET, PASSWORD_WIDGET, RANDOMISE_BUTTON_WIDGET, NAME_WIDGET,
            PLAY_NOW_WIDGET, ESC_CUTSCENE_WIDGET, SKIP_TUTORIAL_WIDGET, CHAT_WIDGET, YES_WIDGET;

    public static void initWidgets(ClientContext ctx) {
        LOGOUT_BUTTON_WIDGET = WidgetEnum.LOGOUT_BUTTON_WIDGET.setWidget(ctx);
        LOGOUT_LOGOUT_WIDGET = WidgetEnum.LOGOUT_LOGOUT_WIDGET.setWidget(ctx);
        CREATE_FREE_ACCOUNT_WIDGET = WidgetEnum.CREATE_FREE_ACCOUNT_WIDGET.setWidget(ctx);
        DONE_WIDGET = WidgetEnum.DONE_WIDGET.setWidget(ctx);
        RANDOM_WIDGET = WidgetEnum.RANDOM_WIDGET.setWidget(ctx);
        AGE_WIDGET = WidgetEnum.AGE_WIDGET.setWidget(ctx);
        EMAIL_ADDRESS_WIDGET = WidgetEnum.EMAIL_ADDRESS_WIDGET.setWidget(ctx);
        PASSWORD_WIDGET = WidgetEnum.PASSWORD_WIDGET.setWidget(ctx);
        RANDOMISE_BUTTON_WIDGET = WidgetEnum.RANDOMISE_BUTTON_WIDGET.setWidget(ctx);
        NAME_WIDGET = WidgetEnum.NAME_WIDGET.setWidget(ctx);
        PLAY_NOW_WIDGET = WidgetEnum.PLAY_NOW_WIDGET.setWidget(ctx);
        ESC_CUTSCENE_WIDGET = WidgetEnum.ESC_CUTSCENE_WIDGET.setWidget(ctx);
        SKIP_TUTORIAL_WIDGET = WidgetEnum.SKIP_TUTORIAL_WIDGET.setWidget(ctx);
        CHAT_WIDGET = WidgetEnum.CHAT_WIDGET.setWidget(ctx);
        YES_WIDGET = WidgetEnum.YES_WIDGET.setWidget(ctx);
    }
}
