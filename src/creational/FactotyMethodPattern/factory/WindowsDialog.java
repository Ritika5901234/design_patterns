package creational.FactotyMethodPattern.factory;

import creational.FactotyMethodPattern.Buttons.Button;
import creational.FactotyMethodPattern.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
