package psp.smashggclient;

import java.io.IOException;
import psp.smashggclient.frames.MainFrame;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
