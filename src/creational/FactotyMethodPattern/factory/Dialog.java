package creational.FactotyMethodPattern.factory;

import creational.FactotyMethodPattern.Buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
