package com.counter;
import com.formdev.flatlaf.themes.FlatMacLightLaf;;
public class Main {
    public static void main(String[] args) {
        FlatMacLightLaf.setup();
        WordandLineCounter c = new WordandLineCounter();
        c.setVisible(true);
    }
}