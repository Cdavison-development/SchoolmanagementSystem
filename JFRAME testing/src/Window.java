import java.awt.*;
import java.awt.event.WindowEvent;

public class Window extends java.awt.Window {
    public Window(Frame owner) {
        super(owner);
    }

    public void pullThePlug() {
        // this will make sure WindowListener.windowClosing() et al. will be called.
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);

        // this will hide and dispose the frame, so that the application quits by
        // itself if there is nothing else around.
        setVisible(false);
        dispose();
    }
}
