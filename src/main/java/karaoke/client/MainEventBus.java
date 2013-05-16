package karaoke.client;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;
import karaoke.client.presenter.EditorPresenter;
import karaoke.client.presenter.RootPresenter;
import karaoke.client.presenter.WorkPresenter;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;

/**
 * Created with IntelliJ IDEA.
 * User: Василий
 * Date: 19.03.13
 * Time: 13:09
 * To change this template use File | Settings | File Templates.
 */
@Events(startPresenter = RootPresenter.class)
public interface MainEventBus extends EventBus {

    @Start
    @Event(handlers = {RootPresenter.class, EditorPresenter.class})
    public void start();

    @Event(handlers = {RootPresenter.class})
    public void changeBody(Widget widget);

    @Event(handlers = {RootPresenter.class})
    public void displayMessage(String string);

    @Event(handlers = {WorkPresenter.class})
    public void showWork();

    @Event(handlers = {EditorPresenter.class})
    public void showEditor();
}
